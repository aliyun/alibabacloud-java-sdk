// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Parameters")
    public java.util.List<GetTemplateParameterConstraintsShrinkRequestParameters> parameters;

    @NameInMap("ParametersKeyFilter")
    public String parametersKeyFilterShrink;

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

    public static GetTemplateParameterConstraintsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsShrinkRequest self = new GetTemplateParameterConstraintsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTemplateParameterConstraintsShrinkRequest setParameters(java.util.List<GetTemplateParameterConstraintsShrinkRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetTemplateParameterConstraintsShrinkRequestParameters> getParameters() {
        return this.parameters;
    }

    public GetTemplateParameterConstraintsShrinkRequest setParametersKeyFilterShrink(String parametersKeyFilterShrink) {
        this.parametersKeyFilterShrink = parametersKeyFilterShrink;
        return this;
    }
    public String getParametersKeyFilterShrink() {
        return this.parametersKeyFilterShrink;
    }

    public GetTemplateParameterConstraintsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateParameterConstraintsShrinkRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateParameterConstraintsShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateParameterConstraintsShrinkRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateParameterConstraintsShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GetTemplateParameterConstraintsShrinkRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTemplateParameterConstraintsShrinkRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParameterConstraintsShrinkRequestParameters self = new GetTemplateParameterConstraintsShrinkRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetTemplateParameterConstraintsShrinkRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateParameterConstraintsShrinkRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
