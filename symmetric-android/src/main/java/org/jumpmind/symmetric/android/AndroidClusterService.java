/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.symmetric.android;

import org.jumpmind.symmetric.db.ISymmetricDialect;
import org.jumpmind.symmetric.service.INodeService;
import org.jumpmind.symmetric.service.IParameterService;
import org.jumpmind.symmetric.service.impl.ClusterService;

public class AndroidClusterService extends ClusterService {
    public AndroidClusterService(IParameterService parameterService, ISymmetricDialect dialect, INodeService nodeService) {
        super(parameterService, dialect, nodeService, null);
    }

    @Override
    protected void initInstanceId() {
        // not relevant on Android.
    }

    @Override
    protected void checkSymDbOwnership() {
        // not relevant on Android.
    }
}
