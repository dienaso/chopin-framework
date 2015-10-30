package com.chopinframework;

/**
 * @author Rob Winch
 */
public interface MessageRepository {

	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

}
