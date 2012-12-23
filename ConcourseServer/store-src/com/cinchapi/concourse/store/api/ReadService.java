package com.cinchapi.concourse.store.api;

import com.cinchapi.concourse.id.Id;
import com.cinchapi.concourse.model.api.Entity;

/**
 * A service that can read from a store.
 * @author jnelson
 *
 */
public interface ReadService {
	
	/**
	 * Load an {@link Entity} from the store.
	 * @param id
	 * @return the {@link Entity}.
	 */
	public Entity load(Id id);

}
