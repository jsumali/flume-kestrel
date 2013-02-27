package com.blangdon.flume.kestrel;

import com.cloudera.flume.core.EventBaseImpl;

/**
 * Created by IntelliJ IDEA.
 * User: jsumali
 * Date: 2/26/13
 * Time: 5:11 PM
 */
class EventStub extends EventBaseImpl {
	private final String msgBody;

	public EventStub(String msgBody) {
		this.msgBody = msgBody;
	}

	@Override
	public byte[] getBody() {
		return msgBody.getBytes();
	}

	@Override
	public Priority getPriority() {
		return Priority.INFO;
	}

	@Override
	public long getTimestamp() {
		return 0;
	}

	@Override
	public long getNanos() {
		return 0;
	}

	@Override
	public String getHost() {
		return "SOME_HOST";
	}
}