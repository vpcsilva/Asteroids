package org.psnbtech;

import java.util.concurrent.Callable;

import org.psnbtech.entity.Entity;

/**
 * @author vpedro
 * Wraps the method update for running in a thread
 */
class ConcurrentUpdater implements Callable<Integer> {
	
	Game game;
	Entity entity;
	public ConcurrentUpdater(Game game, Entity entity) {
		this.game = game;
		this.entity = entity;
	}
	@Override
	public Integer call() throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Starting: " + threadName);
		
		this.entity.update(this.game);
		return null;
	}

	/*@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Starting: " + threadName);
		
		this.entity.update(this.game);
	}*/
	
}