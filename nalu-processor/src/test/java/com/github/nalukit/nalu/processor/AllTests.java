/*
 * Copyright (c) 2018 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.nalu.processor;

import com.github.nalukit.nalu.processor.test.DebugTest;
import com.github.nalukit.nalu.processor.test.FiltersTest;
import com.github.nalukit.nalu.processor.test.HandlerTest;
import com.github.nalukit.nalu.processor.test.ShellCreatorTest;
import com.github.nalukit.nalu.processor.test.model.intern.ClassNameModelTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClassNameModelTest.class,
                      DebugTest.class,
                      FiltersTest.class,
                      HandlerTest.class
//                      ShellCreatorTest.class
})
//                        ApplicationTest.class
//                     ClassNameModelTest.class,
//                     ConsistenceTest.class,
//                     ControllerTest.class,
//                     FilterTest.class })
public class AllTests {
}
