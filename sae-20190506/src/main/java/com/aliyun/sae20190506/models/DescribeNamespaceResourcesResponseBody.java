// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeNamespaceResourcesResponseBodyData data;

    public static DescribeNamespaceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesResponseBody self = new DescribeNamespaceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespaceResourcesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeNamespaceResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespaceResourcesResponseBody setData(DescribeNamespaceResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNamespaceResourcesResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeNamespaceResourcesResponseBodyData extends TeaModel {
        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("NamespaceName")
        @Validation(required = true)
        public String namespaceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("BelongRegion")
        @Validation(required = true)
        public String belongRegion;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("AppCount")
        @Validation(required = true)
        public Long appCount;

        @NameInMap("LastChangeOrderId")
        @Validation(required = true)
        public String lastChangeOrderId;

        @NameInMap("LastChangeOrderStatus")
        @Validation(required = true)
        public String lastChangeOrderStatus;

        @NameInMap("LastChangeOrderRunning")
        @Validation(required = true)
        public Boolean lastChangeOrderRunning;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("VSwitchName")
        @Validation(required = true)
        public String vSwitchName;

        @NameInMap("NotificationExpired")
        @Validation(required = true)
        public Boolean notificationExpired;

        public static DescribeNamespaceResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResourcesResponseBodyData self = new DescribeNamespaceResourcesResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeNamespaceResourcesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNamespaceResourcesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeNamespaceResourcesResponseBodyData setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public DescribeNamespaceResourcesResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeNamespaceResourcesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNamespaceResourcesResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNamespaceResourcesResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeNamespaceResourcesResponseBodyData setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderId(String lastChangeOrderId) {
            this.lastChangeOrderId = lastChangeOrderId;
            return this;
        }
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderStatus(String lastChangeOrderStatus) {
            this.lastChangeOrderStatus = lastChangeOrderStatus;
            return this;
        }
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        public DescribeNamespaceResourcesResponseBodyData setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
            this.lastChangeOrderRunning = lastChangeOrderRunning;
            return this;
        }
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        public DescribeNamespaceResourcesResponseBodyData setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeNamespaceResourcesResponseBodyData setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeNamespaceResourcesResponseBodyData setNotificationExpired(Boolean notificationExpired) {
            this.notificationExpired = notificationExpired;
            return this;
        }
        public Boolean getNotificationExpired() {
            return this.notificationExpired;
        }

    }

}
