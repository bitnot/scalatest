/*
 * Copyright 2001-2014 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalactic

class EnabledEqualityBetween[A, B](implicit cnv: A => B) {
  def apply(a: A): B = cnv(a)
}

object EnabledEqualityBetween {
  def apply[A, B](implicit cnv: A => B): EnabledEqualityBetween[A, B] = new EnabledEqualityBetween[A, B]
}
