/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.project.aj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.project.aj.AnAspect;
import org.springframework.project.core.Core;

/**
 * Unit tests for {@link AnAspect}.
 */
public class AnAspectTests {

	@Test
	public void test() {
		Core core = new Core();
		AnAspect aspect = new AnAspect(core);
		assertTrue(core.equals(aspect.getCore()));
	}

}
