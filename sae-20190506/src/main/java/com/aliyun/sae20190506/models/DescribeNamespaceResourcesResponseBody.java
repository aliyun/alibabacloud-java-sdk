// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request was invalid.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeNamespaceResourcesResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned only if the request fails. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * <ul>
     * <li><p>A successful request does not return the <strong>ErrorCode</strong> field.</p>
     * </li>
     * <li><p>A failed request returns the <strong>ErrorCode</strong> field. For more information, see the list of <strong>error codes</strong> in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the namespace resources were queried successfully.</p>
     * <ul>
     * <li><p><strong>true</strong>: The query was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The query failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID. You can use this ID to query the details of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
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
         * <p>The version of the APM Java agent.</p>
         */
        @NameInMap("ApmJavaAgentVersion")
        public String apmJavaAgentVersion;

        /**
         * <p>The number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppCount")
        public Long appCount;

        /**
         * <p>The region of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>decs</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the jump server application.</p>
         * 
         * <strong>example:</strong>
         * <p>5ec46468-6b26-4a3c-9f7c-bf88761a****</p>
         */
        @NameInMap("JumpServerAppId")
        public String jumpServerAppId;

        /**
         * <p>The IP address of the jump server.</p>
         * 
         * <strong>example:</strong>
         * <p>120.78.XXX.XX</p>
         */
        @NameInMap("JumpServerIp")
        public String jumpServerIp;

        /**
         * <p>The release order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afedb3c4-63f8-4a3d-aaa3-2c30363f****</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether a release order is running in the namespace. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: A release order is running.</p>
         * </li>
         * <li><p><strong>false</strong>: No release order is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The status of the last release order. Valid values:</p>
         * <ul>
         * <li><p><strong>READY</strong>: The release order is ready.</p>
         * </li>
         * <li><p><strong>RUNNING</strong>: The release order is running.</p>
         * </li>
         * <li><p><strong>SUCCESS</strong>: The release order was successful.</p>
         * </li>
         * <li><p><strong>FAIL</strong>: The release order failed.</p>
         * </li>
         * <li><p><strong>ABORT</strong>: The release order was aborted.</p>
         * </li>
         * <li><p><strong>WAIT_BATCH_CONFIRM</strong>: The release order is waiting for manual batch confirmation.</p>
         * </li>
         * <li><p><strong>AUTO_BATCH_WAIT</strong>: The release order is in an automatic batch-wait state.</p>
         * </li>
         * <li><p><strong>SYSTEM_FAIL</strong>: A system error occurred.</p>
         * </li>
         * <li><p><strong>WAIT_APPROVAL</strong>: The release order is pending approval.</p>
         * </li>
         * <li><p><strong>APPROVED</strong>: The release order is approved and pending execution.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        /**
         * <p>The short-format namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NameSpaceShortId")
        public String nameSpaceShortId;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shangha:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>Indicates whether the notification for the release order has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The notification has expired.</p>
         * </li>
         * <li><p><strong>false</strong>: The notification has not expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NotificationExpired")
        public Boolean notificationExpired;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li><p>To use SLS resources that are automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
         * </li>
         * <li><p>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
         * </li>
         * </ul>
         * <p>The configuration includes the following parameters:</p>
         * <ul>
         * <li><p><strong>projectName</strong>: The project name in SLS.</p>
         * </li>
         * <li><p><strong>logDir</strong>: The log path.</p>
         * </li>
         * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> indicates the standard output of the container. Only one stdout entry is allowed. If you omit this parameter, file logs are collected.</p>
         * </li>
         * <li><p><strong>logstoreName</strong>: The Logstore name in SLS.</p>
         * </li>
         * <li><p><strong>logtailName</strong>: The Logtail name in SLS. If you omit this parameter, SAE creates a Logtail.</p>
         * </li>
         * </ul>
         * <p>You do not need to set this parameter if the SLS log collection configuration is unchanged for subsequent deployments. To disable log collection, set this parameter to an empty string (&quot;&quot;).</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>The tenant ID of the SAE namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>838cad95-973f-48fe-830b-2a8546d7****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The vSwitch name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeNamespaceResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResourcesResponseBodyData self = new DescribeNamespaceResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResourcesResponseBodyData setApmJavaAgentVersion(String apmJavaAgentVersion) {
            this.apmJavaAgentVersion = apmJavaAgentVersion;
            return this;
        }
        public String getApmJavaAgentVersion() {
            return this.apmJavaAgentVersion;
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

        public DescribeNamespaceResourcesResponseBodyData setSlsConfigs(String slsConfigs) {
            this.slsConfigs = slsConfigs;
            return this;
        }
        public String getSlsConfigs() {
            return this.slsConfigs;
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
