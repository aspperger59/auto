/*
 * Copyright (C) 2015 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests;

import javax.annotation.Generated;
import javax.inject.Inject;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
)
final class MultipleFactoriesImplementingInterface_ClassAFactory
    implements MultipleFactoriesImplementingInterface.Base.Factory {
  @Inject
  MultipleFactoriesImplementingInterface_ClassAFactory() {}

  MultipleFactoriesImplementingInterface.ClassA create() {
    return new MultipleFactoriesImplementingInterface.ClassA();
  }

  @Override
  public MultipleFactoriesImplementingInterface.ClassA abstractNonDefaultCreate() {
    return create();
  }
}