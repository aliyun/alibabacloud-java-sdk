// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). For more information, refer to <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The parameters that are defined in the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetTemplateParameterConstraintsRequestParameters> parameters;

    /**
     * <p>The list of parameters to be queried.</p>
     */
    @NameInMap("ParametersKeyFilter")
    public java.util.List<String> parametersKeyFilter;

    /**
     * <p>The dependency of the parameters.</p>
     */
    @NameInMap("ParametersOrder")
    public java.util.List<String> parametersOrder;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     * <p>If you specify this parameter, the parameter constraints for an upgrade or downgrade scenario are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The structure of the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommended to use the HTTP POST + Body Param method to pass the parameter in the request body to avoid request failures caused by an excessively long URL.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Parameters&quot;: {
     *     &quot;ZoneInfo&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;
     *     },
     *     &quot;InstanceType&quot;: {
     *       &quot;Type&quot;: &quot;String&quot;
     *     }
     *   },
     *   &quot;Resources&quot;: {
     *     &quot;ECS&quot;: {
     *       &quot;Type&quot;: &quot;ALIYUN::ECS::Instance&quot;,
     *       &quot;Properties&quot;: {
     *         &quot;ZoneId&quot;: {
     *           &quot;Ref&quot;: &quot;ZoneInfo&quot;
     *         },
     *         &quot;InstanceType&quot;: {
     *           &quot;Ref&quot;: &quot;InstanceType&quot;
     *         }
     *       }
     *     }
     *   }
     * }</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
     * <blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud OSS bucket, such as oss\://ros/template/demo or oss\://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the OSS region is not specified, the default is the same as the RegionId parameter.</p>
     * <blockquote>
     * <p>You can specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
     * <blockquote>
     * <p>TemplateVersion is valid only when TemplateId is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateParameterConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsRequest self = new GetTemplateParameterConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTemplateParameterConstraintsRequest setParameters(java.util.List<GetTemplateParameterConstraintsRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetTemplateParameterConstraintsRequestParameters> getParameters() {
        return this.parameters;
    }

    public GetTemplateParameterConstraintsRequest setParametersKeyFilter(java.util.List<String> parametersKeyFilter) {
        this.parametersKeyFilter = parametersKeyFilter;
        return this;
    }
    public java.util.List<String> getParametersKeyFilter() {
        return this.parametersKeyFilter;
    }

    public GetTemplateParameterConstraintsRequest setParametersOrder(java.util.List<String> parametersOrder) {
        this.parametersOrder = parametersOrder;
        return this;
    }
    public java.util.List<String> getParametersOrder() {
        return this.parametersOrder;
    }

    public GetTemplateParameterConstraintsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateParameterConstraintsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateParameterConstraintsRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateParameterConstraintsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateParameterConstraintsRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateParameterConstraintsRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GetTemplateParameterConstraintsRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter that is defined in the template.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterKey.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZoneInfo</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter that is defined in the template.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTemplateParameterConstraintsRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParameterConstraintsRequestParameters self = new GetTemplateParameterConstraintsRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetTemplateParameterConstraintsRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateParameterConstraintsRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
