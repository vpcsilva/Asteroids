package org.psnbtech;

import java.util.concurrent.Callable;

import org.psnbtech.entity.Entity;

/**
 * @author vpedro
 * Wraps the method handleCollision for running in a thread
 */
class ConcurrentHandleColision implements Callable<Integer> {
	Game game;
	Entity entity;
	Entity other;
	
	public ConcurrentHandleColision(Game game, Entity entity, Entity other) {
		this.game = game;
		this.entity = entity;
		this.other = other;
	}

	/*@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Starting: " + threadName);
		this.entity.handleCollision(game, other);
	}*/

	@Override
	public Integer call() throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Starting: " + threadName);
		this.entity.handleCollision(game, other);
		return null;
	}
}