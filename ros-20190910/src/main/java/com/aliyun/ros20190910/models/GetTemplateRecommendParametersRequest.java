// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRecommendParametersRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Parameters")
    public java.util.List<GetTemplateRecommendParametersRequestParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateRecommendParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRecommendParametersRequest self = new GetTemplateRecommendParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRecommendParametersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTemplateRecommendParametersRequest setParameters(java.util.List<GetTemplateRecommendParametersRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetTemplateRecommendParametersRequestParameters> getParameters() {
        return this.parameters;
    }

    public GetTemplateRecommendParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateRecommendParametersRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateRecommendParametersRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateRecommendParametersRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateRecommendParametersRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GetTemplateRecommendParametersRequestParameters extends TeaModel {
        @NameInMap("ParameterCandidateValues")
        public java.util.List<String> parameterCandidateValues;

        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTemplateRecommendParametersRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateRecommendParametersRequestParameters self = new GetTemplateRecommendParametersRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetTemplateRecommendParametersRequestParameters setParameterCandidateValues(java.util.List<String> parameterCandidateValues) {
            this.parameterCandidateValues = parameterCandidateValues;
            return this;
        }
        public java.util.List<String> getParameterCandidateValues() {
            return this.parameterCandidateValues;
        }

        public GetTemplateRecommendParametersRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateRecommendParametersRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
