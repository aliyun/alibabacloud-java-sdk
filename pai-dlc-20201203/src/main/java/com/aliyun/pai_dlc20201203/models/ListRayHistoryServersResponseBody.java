// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRayHistoryServersResponseBody extends TeaModel {
    @NameInMap("RayHistoryServers")
    public java.util.List<ListRayHistoryServersResponseBodyRayHistoryServers> rayHistoryServers;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <strong>example:</strong>
         * <p>AEB-RECHARGE-TASK-14478-1778466397-main-4-</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <strong>example:</strong>
         * <p>2025-12-30T02:43:52Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2026-01-27T09:17:11Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <strong>example:</strong>
         * <p>2026-05-19T04:05:46Z</p>
         */
        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxRuntimeMinutes")
        public Integer maxRuntimeMinutes;

        /**
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
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>PyTorchJob dlc1tx4b9lw3ntb9 is running.</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p>quotazoqd53w0q75</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>OWNER_REPO</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
         */
        @NameInMap("StoragePath")
        public String storagePath;

        /**
         * <strong>example:</strong>
         * <p>1335237941080704</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>myusername</p>
         */
        @NameInMap("Username")
        public String username;

        /**
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
