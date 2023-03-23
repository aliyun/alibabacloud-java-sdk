// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeNamespaceResourcesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about resources in the namespace was queried successfully. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the query was successful.</p>
     * <p>*   **false**: indicates that the query failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeNamespaceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesResponseBody self = new DescribeNamespaceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResourcesResponseBody setData(DescribeNamespaceResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNamespaceResourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeNamespaceResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespaceResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespaceResourcesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeNamespaceResourcesResponseBodyData extends TeaModel {
        /**
         * <p>The number of applications.</p>
         */
        @NameInMap("AppCount")
        public Long appCount;

        /**
         * <p>The region to which the namespace belongs.</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the jump server application.</p>
         */
        @NameInMap("JumpServerAppId")
        public String jumpServerAppId;

        /**
         * <p>The IP address of the jump server.</p>
         */
        @NameInMap("JumpServerIp")
        public String jumpServerIp;

        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether a change order is being executed in the namespace. Valid values:</p>
         * <br>
         * <p>*   **true**: indicates that a change order is being executed in the namespace.</p>
         * <p>*   **false**: indicates that no change orders are being executed in the namespace.</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The status of the latest change order. Valid values:</p>
         * <br>
         * <p>*   **READY**: The change order is ready.</p>
         * <p>*   **RUNNING**: The change order is being executed.</p>
         * <p>*   **SUCCESS**: The change order was executed.</p>
         * <p>*   **FAIL**: The change order could not be executed.</p>
         * <p>*   **ABORT**: The change order was terminated.</p>
         * <p>*   **WAIT_BATCH_CONFIRM**: The change order is pending execution. You must manually confirm the release batch.</p>
         * <p>*   **AUTO_BATCH_WAIT**: The change order is pending execution. SAE will automatically confirm the release batch.</p>
         * <p>*   **SYSTEM_FAIL**: A system exception occurred.</p>
         * <p>*   **WAIT_APPROVAL**: The change order is pending approval.</p>
         * <p>*   **APPROVED**: The change order is approved and is pending execution.</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        @NameInMap("NameSpaceShortId")
        public String nameSpaceShortId;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>Indicates whether the notification of a change order is expired. Valid values:</p>
         * <br>
         * <p>*   **true**: indicates that the notification is expired.</p>
         * <p>*   **false**: indicates that the notification is not expired.</p>
         */
        @NameInMap("NotificationExpired")
        public Boolean notificationExpired;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the tenant in the SAE namespace.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeNamespaceResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResourcesResponseBodyData self = new DescribeNamespaceResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResourcesResponseBodyData setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public DescribeNamespaceResourcesResponseBodyData setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public DescribeNamespaceResourcesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNamespaceResourcesResponseBodyData setJumpServerAppId(String jumpServerAppId) {
            this.jumpServerAppId = jumpServerAppId;
            return this;
        }
        public String getJumpServerAppId() {
            return this.jumpServerAppId;
        }

        public DescribeNamespaceResourcesResponseBodyData setJumpServerIp(String jumpServerIp) {
            this.jumpServerIp = jumpServerIp;
            return this;
        }
        public String getJumpServerIp() {
            return this.jumpServerIp;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderId(String lastChangeOrderId) {
            this.lastChangeOrderId = lastChangeOrderId;
            return this;
        }
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
            this.lastChangeOrderRunning = lastChangeOrderRunning;
            return this;
        }
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderStatus(String lastChangeOrderStatus) {
            this.lastChangeOrderStatus = lastChangeOrderStatus;
            return this;
        }
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        public DescribeNamespaceResourcesResponseBodyData setNameSpaceShortId(String nameSpaceShortId) {
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        public DescribeNamespaceResourcesResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespaceResourcesResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespaceResourcesResponseBodyData setNotificationExpired(Boolean notificationExpired) {
            this.notificationExpired = notificationExpired;
            return this;
        }
        public Boolean getNotificationExpired() {
            return this.notificationExpired;
        }

        public DescribeNamespaceResourcesResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeNamespaceResourcesResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeNamespaceResourcesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeNamespaceResourcesResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNamespaceResourcesResponseBodyData setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeNamespaceResourcesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNamespaceResourcesResponseBodyData setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
