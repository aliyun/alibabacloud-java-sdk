// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeNamespaceResourcesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AppCount")
        public Long appCount;

        @NameInMap("BelongRegion")
        public String belongRegion;

        @NameInMap("Description")
        public String description;

        @NameInMap("JumpServerAppId")
        public String jumpServerAppId;

        @NameInMap("JumpServerIp")
        public String jumpServerIp;

        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("NotificationExpired")
        public Boolean notificationExpired;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

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
