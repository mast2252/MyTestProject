import java.util.concurrent.*;

public class TestThreadExecutor
{

	public static void main(String[] args) throws ExecutionException, InterruptedException
	{
		ExecutorService threadPool = Executors.newFixedThreadPool(4);

		// lancement thread 1
		final Future<String> future1 = threadPool.submit(new Callable<String>()
		{
			@Override
			public String call()
			{
				int i = 0;
				while (i < 100)
				{
					i++;
					try
					{
						Thread.sleep(1);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("Thread 1 - " + i);
				}

				return "########### Thread 1 over";
			}
		});

		// lancement thread 2
		final Future<String> future2 = threadPool.submit(new Callable<String>()
		{
			@Override
			public String call()
			{
				int i = 0;
				while (i < 100)
				{
					i++;
					try
					{
						Thread.sleep(1);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("Thread 2 - " + i);
				}
				return "########### Thread 2 over";
			}
		});

		// lancement thread qui affiche résultat du thread 1
		threadPool.submit(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					System.out.println(future1.get()); // bloqué tant que future1 n'a pas sa valeur
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				catch (ExecutionException e)
				{
					e.printStackTrace();
				}
			}
		});

		// lancement thread qui affiche résultat du thread 2
		threadPool.submit(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					System.out.println(future2.get()); // bloqué tant que future2 n'a pas sa valeur
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				catch (ExecutionException e)
				{
					e.printStackTrace();
				}
			}
		});

		threadPool.shutdown();


	}
}
