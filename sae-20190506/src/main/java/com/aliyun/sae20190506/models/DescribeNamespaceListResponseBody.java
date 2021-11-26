// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeNamespaceListResponseBodyData> data;

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
        @NameInMap("AgentInstall")
        public String agentInstall;

        @NameInMap("Current")
        public Boolean current;

        @NameInMap("Custom")
        public Boolean custom;

        @NameInMap("HybridCloudEnable")
        public Boolean hybridCloudEnable;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
