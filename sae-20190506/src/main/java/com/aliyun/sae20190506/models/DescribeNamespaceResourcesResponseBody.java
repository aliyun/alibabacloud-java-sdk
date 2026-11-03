// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirect.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("Data")
    public DescribeNamespaceResourcesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.Obviously</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The request is normal.</li>
     * <li>Specific error code: The request is abnormal.</li>
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
     * <p>Indicates whether the namespace resource information was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to accurately query call information.</p>
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
         * 
         * <strong>example:</strong>
         * <p>2.5.0</p>
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
         * <p>The region to which the namespace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The namespace description.</p>
         * 
         * <strong>example:</strong>
         * <p>decs</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The jump server application ID.</p>
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
         * <p>The change order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afedb3c4-63f8-4a3d-aaa3-2c30363f****</p>
         */
        @NameInMap("LastChangeOrderId")
        public String lastChangeOrderId;

        /**
         * <p>Indicates whether a change order is running in the namespace. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A change order is running.</li>
         * <li><strong>false</strong>: No change order is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LastChangeOrderRunning")
        public Boolean lastChangeOrderRunning;

        /**
         * <p>The status of the latest change order. Valid values:</p>
         * <ul>
         * <li><strong>READY</strong>: The latest change order is ready.</li>
         * <li><strong>RUNNING</strong>: The latest change order is running.</li>
         * <li><strong>SUCCESS</strong>: The latest change order is successful.</li>
         * <li><strong>FAIL</strong>: The latest change order failed.</li>
         * <li><strong>ABORT</strong>: The latest change order is aborted.</li>
         * <li><strong>WAIT_BATCH_CONFIRM</strong>: The latest change order is waiting for manual batch confirmation.</li>
         * <li><strong>AUTO_BATCH_WAIT</strong>: The latest change order is in the automatic batch waiting state.</li>
         * <li><strong>SYSTEM_FAIL</strong>: A system fault occurred.</li>
         * <li><strong>WAIT_APPROVAL</strong>: The latest change order is waiting for approval.</li>
         * <li><strong>APPROVED</strong>: The latest change order is approved and waiting to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastChangeOrderStatus")
        public String lastChangeOrderStatus;

        /**
         * <p>The short namespace ID.</p>
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
         * <p>Indicates whether the change order notification has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The change order notification has expired.</li>
         * <li><strong>false</strong>: The change order notification has not expired.</li>
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
         * <p>The configurations for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li>To use SLS resources through automatic creation by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>Metric description:</p>
         * <ul>
         * <li><strong>projectName</strong>: The name of the SLS project.  </li>
         * <li><strong>logDir</strong>: The log path.</li>
         * <li><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs. You can configure only one such log in the Settings. If you do not configure it, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: The name of the SLS Logstore.</li>
         * <li><strong>logtailName</strong>: The name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
         * </ul>
         * <p>If the SLS collection configurations remain unchanged during multiple deployments, you do not need to modify the Settings for this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need to use the SLS collection feature, you must change the Settings of this field to an empty character string in the request (that is, the value of the <strong>SlsConfigs</strong> field is &quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
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
