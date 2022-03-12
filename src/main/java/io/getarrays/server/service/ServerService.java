package io.getarrays.server.service;

import java.util.Collection;

import io.getarrays.server.model.Server;

public interface ServerService {
	Server create(Server server);
	Server ping(String ipAddress);
	Collection<Server> List(int limit);
	Server get(Long id);
	Server update(Server server);
	Boolean delete(Long id);
}
