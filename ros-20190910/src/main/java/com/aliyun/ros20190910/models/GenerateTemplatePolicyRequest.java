// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyRequest extends TeaModel {
    /**
     * <p>The options that control how the template access policy is generated. This parameter is of the LIST type. You can specify whether to resolve template parameters and the permission scope of the generated policy: 
     * <strong>ResolveParameters</strong> indicates that the policy is generated after conditions and resources are resolved based on the specified Parameters or parameter default values.</p>
     * <p><strong>IgnoreParameters</strong> indicates that the policy is generated without resolving parameters, using the legacy logic.</p>
     * <p><strong>MandatoryPolicy</strong> indicates that only the minimum permissions required for template execution are generated.</p>
     * <p><strong>FullPolicy</strong> indicates that a full access policy is generated.</p>
     * <p>ResolveParameters and IgnoreParameters are mutually exclusive. MandatoryPolicy and FullPolicy are mutually exclusive. MandatoryPolicy must be used together with ResolveParameters.</p>
     * <p>If this parameter is not specified, ResolveParameters + FullPolicy is used by default when Parameters is specified. Otherwise, IgnoreParameters + FullPolicy is used by default.</p>
     */
    @NameInMap("GenerateOptions")
    public java.util.List<String> generateOptions;

    /**
     * <p>The operation types for which policy information is generated.</p>
     */
    @NameInMap("OperationTypes")
    public java.util.List<String> operationTypes;

    /**
     * <p>The input parameters. The input parameters define the parameters that must be specified when you create a stack by using this template. These parameters specify the details of each stack creation, such as the username, password, and environment-specific ECS instance types.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GenerateTemplatePolicyRequestParameters> parameters;

    /**
     * <p>The structure of the template body. The length is 1 to 524,288 bytes.
     * If the length is large, we recommend that you use the HTTP POST method and include the parameter in the request body to avoid request failures caused by an excessively long URL.  </p>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. Shared templates and private templates are supported.<br>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on a web server (HTTP or HTTPS) or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=ap-southeast-1. The maximum size of the template is 524,288 bytes.</p>
     * <blockquote>
     * <p>If the OSS region is not specified, the region specified by the RegionId parameter is used by default.</p>
     * </blockquote>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.
     * Maximum length: 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The template version. This parameter takes effect only when TemplateId is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GenerateTemplatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyRequest self = new GenerateTemplatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyRequest setGenerateOptions(java.util.List<String> generateOptions) {
        this.generateOptions = generateOptions;
        return this;
    }
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    public GenerateTemplatePolicyRequest setOperationTypes(java.util.List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }
    public java.util.List<String> getOperationTypes() {
        return this.operationTypes;
    }

    public GenerateTemplatePolicyRequest setParameters(java.util.List<GenerateTemplatePolicyRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GenerateTemplatePolicyRequestParameters> getParameters() {
        return this.parameters;
    }

    public GenerateTemplatePolicyRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GenerateTemplatePolicyRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GenerateTemplatePolicyRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GenerateTemplatePolicyRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GenerateTemplatePolicyRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter. If you do not specify the name and value of a parameter defined in the template, Resource Orchestration Service (ROS) uses the default value specified in the template.<br>Maximum value of N: 200.
         * Example values:</p>
         * <ul>
         * <li><p>Parameters.1.ParameterKey: <code>Name</code>.</p>
         * </li>
         * <li><p>Parameters.2.ParameterKey: <code>Netmode</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter defined in the template. Maximum value of N: 200.  </p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, Parameters.N.ParameterValue is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GenerateTemplatePolicyRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyRequestParameters self = new GenerateTemplatePolicyRequestParameters();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GenerateTemplatePolicyRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
