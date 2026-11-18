// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayParametersResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameters")
    public DescribeTairAIGatewayParametersResponseBodyParameters parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90B82DB7-FB28-4CC2-ADBF-1F8659F3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTairAIGatewayParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayParametersResponseBody self = new DescribeTairAIGatewayParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayParametersResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairAIGatewayParametersResponseBody setParameters(DescribeTairAIGatewayParametersResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeTairAIGatewayParametersResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeTairAIGatewayParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairAIGatewayParametersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTairAIGatewayParametersResponseBodyParametersParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeTairAIGatewayParametersResponseBodyParametersParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayParametersResponseBodyParametersParameters self = new DescribeTairAIGatewayParametersResponseBodyParametersParameters();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayParametersResponseBodyParametersParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeTairAIGatewayParametersResponseBodyParametersParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeTairAIGatewayParametersResponseBodyParameters extends TeaModel {
        @NameInMap("Parameters")
        public java.util.List<DescribeTairAIGatewayParametersResponseBodyParametersParameters> parameters;

        public static DescribeTairAIGatewayParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayParametersResponseBodyParameters self = new DescribeTairAIGatewayParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayParametersResponseBodyParameters setParameters(java.util.List<DescribeTairAIGatewayParametersResponseBodyParametersParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeTairAIGatewayParametersResponseBodyParametersParameters> getParameters() {
            return this.parameters;
        }

    }

}
