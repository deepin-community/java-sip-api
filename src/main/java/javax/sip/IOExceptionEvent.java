/**
 * Copyright (C) 2015, The Open Telecoms Project, http://opentelecoms.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package javax.sip;

import java.util.EventObject;

public class IOExceptionEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	private String mHost;
	private int mPort;
	private String mTransport;

	public IOExceptionEvent(Object source, String remoteHost, int port,
			String transport) {
		super(source);
		this.mHost = remoteHost;
		this.mPort = port;
		this.mTransport = transport;
	}

	public String getHost() {
		return mHost;
	}

	public int getPort() {
		return mPort;
	}

	public String getTransport() {
		return this.mTransport;
	}

}
