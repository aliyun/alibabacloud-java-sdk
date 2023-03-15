// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRecommendParametersResponseBody extends TeaModel {
    @NameInMap("RecommendParameterValues")
    public java.util.List<GetTemplateRecommendParametersResponseBodyRecommendParameterValues> recommendParameterValues;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateRecommendParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRecommendParametersResponseBody self = new GetTemplateRecommendParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateRecommendParametersResponseBody setRecommendParameterValues(java.util.List<GetTemplateRecommendParametersResponseBodyRecommendParameterValues> recommendParameterValues) {
        this.recommendParameterValues = recommendParameterValues;
        return this;
    }
    public java.util.List<GetTemplateRecommendParametersResponseBodyRecommendParameterValues> getRecommendParameterValues() {
        return this.recommendParameterValues;
    }

    public GetTemplateRecommendParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTemplateRecommendParametersResponseBodyRecommendParameterValues extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("RecommendValue")
        public String recommendValue;

        public static GetTemplateRecommendParametersResponseBodyRecommendParameterValues build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateRecommendParametersResponseBodyRecommendParameterValues self = new GetTemplateRecommendParametersResponseBodyRecommendParameterValues();
            return TeaModel.build(map, self);
        }

        public GetTemplateRecommendParametersResponseBodyRecommendParameterValues setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateRecommendParametersResponseBodyRecommendParameterValues setRecommendValue(String recommendValue) {
            this.recommendValue = recommendValue;
            return this;
        }
        public String getRecommendValue() {
            return this.recommendValue;
        }

    }

}
