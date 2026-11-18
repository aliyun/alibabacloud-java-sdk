// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayPluginSwitchResponseBody extends TeaModel {
    /**
     * <p>The instance ID, which is globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameters")
    public DescribeTairAIGatewayPluginSwitchResponseBodyParameters parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC1E3D6-7C88-4DF5-9A3D-0DB1E6D9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries for the plug-in switch.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTairAIGatewayPluginSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayPluginSwitchResponseBody self = new DescribeTairAIGatewayPluginSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayPluginSwitchResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairAIGatewayPluginSwitchResponseBody setParameters(DescribeTairAIGatewayPluginSwitchResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeTairAIGatewayPluginSwitchResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeTairAIGatewayPluginSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairAIGatewayPluginSwitchResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters self = new DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeTairAIGatewayPluginSwitchResponseBodyParameters extends TeaModel {
        @NameInMap("Parameters")
        public java.util.List<DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters> parameters;

        public static DescribeTairAIGatewayPluginSwitchResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayPluginSwitchResponseBodyParameters self = new DescribeTairAIGatewayPluginSwitchResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayPluginSwitchResponseBodyParameters setParameters(java.util.List<DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeTairAIGatewayPluginSwitchResponseBodyParametersParameters> getParameters() {
            return this.parameters;
        }

    }

}
