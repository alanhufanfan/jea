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
package com.ea.core.achieve.bolt;

import com.ea.core.base.context.AppServerBeanFactory;
import com.ea.core.facade.IFacade;
import com.ea.core.storm.bolt.AbstractDrpcBolt;

public class DefaultDrpcBolt extends AbstractDrpcBolt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3178434356705094106L;

	@Override
	protected Object perform(String facadeName, Object... models) throws Exception {
		// TODO Auto-generated method stub
		IFacade facade = (IFacade) AppServerBeanFactory.getBeanFactory().getBean(facadeName);
		return facade.facade(models);
	}
}
