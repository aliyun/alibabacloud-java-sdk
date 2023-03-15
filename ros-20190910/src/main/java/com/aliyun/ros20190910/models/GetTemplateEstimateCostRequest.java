// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Parameters")
    public java.util.List<GetTemplateEstimateCostRequestParameters> parameters;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the scenario.</p>
     * <br>
     * <p>For more information about how to query the IDs of scenarios, see [ListTemplateScratches](~~363050~~).</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The region ID of the scenario. The default value is the same as the value of the RegionId parameter.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("TemplateScratchRegionId")
    public String templateScratchRegionId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateEstimateCostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostRequest self = new GetTemplateEstimateCostRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateEstimateCostRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTemplateEstimateCostRequest setParameters(java.util.List<GetTemplateEstimateCostRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetTemplateEstimateCostRequestParameters> getParameters() {
        return this.parameters;
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

    public GetTemplateEstimateCostRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateEstimateCostRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public GetTemplateEstimateCostRequest setTemplateScratchRegionId(String templateScratchRegionId) {
        this.templateScratchRegionId = templateScratchRegionId;
        return this;
    }
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    public GetTemplateEstimateCostRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GetTemplateEstimateCostRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class GetTemplateEstimateCostRequestParameters extends TeaModel {
        /**
         * <p>The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value that are specified in the template.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>Examples:</p>
         * <br>
         * <p>*   Parameters.1.ParameterKey: `Name`</p>
         * <p>*   Parameters.2.ParameterKey: `Netmode`</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>Examples:</p>
         * <br>
         * <p>*   Parameters.1.ParameterValue: `DemoEip`</p>
         * <p>*   Parameters.2.ParameterValue: `public`</p>
         * <br>
         * <p>>  The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         */
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
