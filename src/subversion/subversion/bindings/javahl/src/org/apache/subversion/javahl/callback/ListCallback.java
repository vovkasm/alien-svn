/**
 * @copyright
 * ====================================================================
 *    Licensed to the Apache Software Foundation (ASF) under one
 *    or more contributor license agreements.  See the NOTICE file
 *    distributed with this work for additional information
 *    regarding copyright ownership.  The ASF licenses this file
 *    to you under the Apache License, Version 2.0 (the
 *    "License"); you may not use this file except in compliance
 *    with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 * ====================================================================
 * @endcopyright
 */

package org.apache.subversion.javahl.callback;

import org.apache.subversion.javahl.ISVNClient;
import org.apache.subversion.javahl.types.DirEntry;
import org.apache.subversion.javahl.types.Lock;

/**
 * This interface is used to receive every single line for a file on a
 * the {@link ISVNClient#blame} call.
 */
public interface ListCallback
{
    /**
     * This method will be called for each directory entry.
     */
    public void doEntry(DirEntry dirent, Lock lock);
}
