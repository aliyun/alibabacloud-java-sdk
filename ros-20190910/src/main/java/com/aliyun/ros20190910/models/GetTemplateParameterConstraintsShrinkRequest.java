// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of parameter N in the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetTemplateParameterConstraintsShrinkRequestParameters> parameters;

    /**
     * <p>The parameters whose values you want to query.</p>
     */
    @NameInMap("ParametersKeyFilter")
    public String parametersKeyFilterShrink;

    /**
     * <p>The order in which associated parameters are arranged.</p>
     * <br>
     * <p>>  By default, the order of the associated parameters specified in the `Metadata` section of the template is used.</p>
     */
    @NameInMap("ParametersOrder")
    public String parametersOrderShrink;

    /**
     * <p>The region ID of the template.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure that contains the template body.</p>
     * <br>
     * <p>The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <br>
     * <p>>  This parameter takes effect only if the TemplateId parameter is specified.</p>
     */
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

    public GetTemplateParameterConstraintsShrinkRequest setParametersOrderShrink(String parametersOrderShrink) {
        this.parametersOrderShrink = parametersOrderShrink;
        return this;
    }
    public String getParametersOrderShrink() {
        return this.parametersOrderShrink;
    }

    public GetTemplateParameterConstraintsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateParameterConstraintsShrinkRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
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
        /**
         * <p>The name of parameter N in the template.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterKey parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N in the template.</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterValue parameter.</p>
         */
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
