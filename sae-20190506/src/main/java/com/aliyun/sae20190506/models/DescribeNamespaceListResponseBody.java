// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of namespaces.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeNamespaceListResponseBodyData> data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <ul>
     * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
     * <li>An error code: If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the namespaces were obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The namespaces were obtained.</li>
     * <li><strong>false</strong>: The namespaces failed to be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622920113732501e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeNamespaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListResponseBody self = new DescribeNamespaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceListResponseBody setData(java.util.List<DescribeNamespaceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNamespaceListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNamespaceListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespaceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespaceListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeNamespaceListResponseBodyData extends TeaModel {
        /**
         * <p>The command that was run to install the agent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://edas-bj.oss-cn-beijing-internal.aliyuncs.com/test/install.sh">http://edas-bj.oss-cn-beijing-internal.aliyuncs.com/test/install.sh</a></p>
         */
        @NameInMap("AgentInstall")
        public String agentInstall;

        /**
         * <p>This parameter is no longer valid.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Current")
        public Boolean current;

        /**
         * <p>Indicates whether custom namespaces are returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Custom namespaces are returned.</li>
         * <li><strong>false</strong>: Custom namespaces are not returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Custom")
        public Boolean custom;

        /**
         * <p>Specifies whether hybrid cloud namespaces are excluded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Hybrid cloud namespaces are excluded.</li>
         * <li><strong>false</strong>: Hybrid cloud namespaces are included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HybridCloudEnable")
        public Boolean hybridCloudEnable;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NameSpaceShortId")
        public String nameSpaceShortId;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The region to which the namespace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNamespaceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceListResponseBodyData self = new DescribeNamespaceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceListResponseBodyData setAgentInstall(String agentInstall) {
            this.agentInstall = agentInstall;
            return this;
        }
        public String getAgentInstall() {
            return this.agentInstall;
        }

        public DescribeNamespaceListResponseBodyData setCurrent(Boolean current) {
            this.current = current;
            return this;
        }
        public Boolean getCurrent() {
            return this.current;
        }

        public DescribeNamespaceListResponseBodyData setCustom(Boolean custom) {
            this.custom = custom;
            return this;
        }
        public Boolean getCustom() {
            return this.custom;
        }

        public DescribeNamespaceListResponseBodyData setHybridCloudEnable(Boolean hybridCloudEnable) {
            this.hybridCloudEnable = hybridCloudEnable;
            return this;
        }
        public Boolean getHybridCloudEnable() {
            return this.hybridCloudEnable;
        }

        public DescribeNamespaceListResponseBodyData setNameSpaceShortId(String nameSpaceShortId) {
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        public DescribeNamespaceListResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespaceListResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespaceListResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNamespaceListResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeNamespaceListResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNamespaceListResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
