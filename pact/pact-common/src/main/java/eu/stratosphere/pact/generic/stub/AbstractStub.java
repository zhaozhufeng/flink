/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/

package eu.stratosphere.pact.generic.stub;

import eu.stratosphere.nephele.configuration.Configuration;
import eu.stratosphere.pact.common.stubs.RuntimeContext;
import eu.stratosphere.pact.common.stubs.Stub;

/**
 * An abstract stub implementation that does nothing when opened or closed.
 */
public abstract class AbstractStub implements Stub {
	
	private RuntimeContext runtimeContext;

	public final void setRuntimeContext(RuntimeContext t) {
		if (this.runtimeContext == null) {
			this.runtimeContext = t;
		} else {
			throw new IllegalStateException("Error: The runtime context has already been set.");
		}
	}
	
	public final RuntimeContext getRuntimeContext() {
		if (this.runtimeContext != null) {
			return this.runtimeContext;
		} else {
			throw new IllegalStateException("The runtime context has not been initialized.");
		}
	}
	
	
	@Override
	public void open(Configuration parameters) throws Exception {}

	@Override
	public void close() throws Exception {}
}
