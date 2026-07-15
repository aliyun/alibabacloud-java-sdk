// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRayHistoryServersResponseBody extends TeaModel {
    /**
     * <p>The list of RayHistoryServer entries.</p>
     */
    @NameInMap("RayHistoryServers")
    public java.util.List<ListRayHistoryServersResponseBodyRayHistoryServers> rayHistoryServers;

    /**
     * <p>The request ID, which is used for diagnostics and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRayHistoryServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRayHistoryServersResponseBody self = new ListRayHistoryServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRayHistoryServersResponseBody setRayHistoryServers(java.util.List<ListRayHistoryServersResponseBodyRayHistoryServers> rayHistoryServers) {
        this.rayHistoryServers = rayHistoryServers;
        return this;
    }
    public java.util.List<ListRayHistoryServersResponseBodyRayHistoryServers> getRayHistoryServers() {
        return this.rayHistoryServers;
    }

    public ListRayHistoryServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRayHistoryServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRayHistoryServersResponseBodyRayHistoryServers extends TeaModel {
        /**
         * <p>The visibility of the job. Valid values:</p>
         * <ul>
         * <li>PUBLIC: visible to all users in the workspace.</li>
         * <li>PRIVATE (default): visible only to you and administrators in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The display name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>AEB-RECHARGE-TASK-14478-1778466397-main-4-</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The hardware specifications of the public resource group. Visit <a href="https://help.aliyun.com/document_detail/171758.html">PAI-DLC billing</a> for a detailed list of specifications.&gt;Notice: Prices vary depending on the specifications..</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <p>The time when the job was created, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30T02:43:52Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the job ended, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-27T09:17:11Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <p>The time when the job was last modified, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-19T04:05:46Z</p>
         */
        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        /**
         * <p>The maximum runtime in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxRuntimeMinutes")
        public Integer maxRuntimeMinutes;

        /**
         * <p>The ID of the created RayHistoryServer.</p>
         * 
         * <strong>example:</strong>
         * <p>rhsxxx</p>
         */
        @NameInMap("RayHistoryServerId")
        public String rayHistoryServerId;

        /**
         * <p>Ray Dashboard URL。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/">https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/</a></p>
         */
        @NameInMap("RayHistoryServerUrl")
        public String rayHistoryServerUrl;

        /**
         * <p>The status detail code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The status details.</p>
         * 
         * <strong>example:</strong>
         * <p>PyTorchJob dlc1tx4b9lw3ntb9 is running.</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The resource group ID. For information about how to query the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>quotazoqd53w0q75</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource on which the job runs.</p>
         * 
         * <strong>example:</strong>
         * <p>OWNER_REPO</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The RayHistoryServer status. Valid values:</p>
         * <ul>
         * <li>Creating: being created.</li>
         * <li>Running: running.</li>
         * <li>Stopped: stopped.</li>
         * <li>Succeeded: succeeded.</li>
         * <li>Failed: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage path of Ray logs.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
         */
        @NameInMap("StoragePath")
        public String storagePath;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1335237941080704</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>myusername</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>..</p>
         * 
         * <strong>example:</strong>
         * <p>153466</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListRayHistoryServersResponseBodyRayHistoryServers build(java.util.Map<String, ?> map) throws Exception {
            ListRayHistoryServersResponseBodyRayHistoryServers self = new ListRayHistoryServersResponseBodyRayHistoryServers();
            return TeaModel.build(map, self);
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setGmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setMaxRuntimeMinutes(Integer maxRuntimeMinutes) {
            this.maxRuntimeMinutes = maxRuntimeMinutes;
            return this;
        }
        public Integer getMaxRuntimeMinutes() {
            return this.maxRuntimeMinutes;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setRayHistoryServerId(String rayHistoryServerId) {
            this.rayHistoryServerId = rayHistoryServerId;
            return this;
        }
        public String getRayHistoryServerId() {
            return this.rayHistoryServerId;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setRayHistoryServerUrl(String rayHistoryServerUrl) {
            this.rayHistoryServerUrl = rayHistoryServerUrl;
            return this;
        }
        public String getRayHistoryServerUrl() {
            return this.rayHistoryServerUrl;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListRayHistoryServersResponseBodyRayHistoryServers setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
