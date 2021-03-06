// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<GetTemplateEstimateCostRequestParameters> parameters;

    public static GetTemplateEstimateCostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostRequest self = new GetTemplateEstimateCostRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateEstimateCostRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateEstimateCostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateEstimateCostRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateEstimateCostRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTemplateEstimateCostRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateEstimateCostRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateEstimateCostRequest setParameters(java.util.List<GetTemplateEstimateCostRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetTemplateEstimateCostRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class GetTemplateEstimateCostRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTemplateEstimateCostRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateEstimateCostRequestParameters self = new GetTemplateEstimateCostRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetTemplateEstimateCostRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateEstimateCostRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
