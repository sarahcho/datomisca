/*
 * Copyright 2012 Pellucid and Zenexity
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

package datomisca

import scala.language.reflectiveCalls

import clojure.lang.Keyword


class Partition(val keyword: Keyword) extends AnyVal {
  override def toString = keyword.toString
}

object Partition {
  val DB   = new Partition(Namespace.DB.PART / "db")
  val TX   = new Partition(Namespace.DB.PART / "tx")
  val USER = new Partition(Namespace.DB.PART / "user")
}

