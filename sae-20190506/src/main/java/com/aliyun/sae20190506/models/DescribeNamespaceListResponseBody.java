// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
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
     * <br>
     * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the namespaces were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The namespaces were obtained.</p>
     * <p>*   **false**: The namespaces failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
         */
        @NameInMap("AgentInstall")
        public String agentInstall;

        /**
         * <p>This parameter is no longer valid.</p>
         */
        @NameInMap("Current")
        public Boolean current;

        /**
         * <p>Indicates whether custom namespaces are returned. Valid values:</p>
         * <br>
         * <p>*   **true**: Custom namespaces are returned.</p>
         * <p>*   **false**: Custom namespaces are not returned.</p>
         */
        @NameInMap("Custom")
        public Boolean custom;

        /**
         * <p>Specifies whether hybrid cloud namespaces are excluded. Valid values:</p>
         * <br>
         * <p>*   **true**: Hybrid cloud namespaces are excluded.</p>
         * <p>*   **false**: Hybrid cloud namespaces are included.</p>
         */
        @NameInMap("HybridCloudEnable")
        public Boolean hybridCloudEnable;

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
         * <p>The region to which the namespace belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
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
