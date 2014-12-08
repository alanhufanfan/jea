/**
 * Copyright 2014 伊永飞
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ea.core.integration.storm;

import com.ea.core.bridge.AbstractConnector;
import com.ea.core.bridge.IClient;

public class StormConnector extends AbstractConnector {

	private IClient remoteClient;
	
	@Override
	protected IClient client() {
		// TODO Auto-generated method stub
		return remoteClient;
	}
	@Override
	public void setClient(IClient client) {
		// TODO Auto-generated method stub
		remoteClient = client;
	}
	@Override
	public String findByFacade(String facadeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
