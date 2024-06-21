// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostRequest extends TeaModel {
    /**
     * <p>The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value that are specified in the template.</p>
     * <p>Maximum value of N: 200.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Parameters.1.ParameterKey: <code>Name</code></li>
     * <li>Parameters.2.ParameterKey: <code>Netmode</code></li>
     * </ul>
     * <blockquote>
     * <p> The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the scenario. The default value is the same as the value of the RegionId parameter.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetTemplateEstimateCostRequestParameters> parameters;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID.</p>
     * <p>This parameter is used to query the estimated price in a configuration change scenario.</p>
     * <p>Assume that the specified stack contains only one Elastic Compute Service (ECS) instance and the instance type is ecs.s6-c1m2.large. You downgrade the instance type to ecs.s6-c1m1.small and specify a new ApsaraDB RDS instance in the template that is used for the price inquiry. The queried result is the sum of the downgrade refund of the ECS instance and the price of the new ApsaraDB RDS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The value of parameter N.</p>
     * <p>Maximum value of N: 200.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Parameters.1.ParameterValue: <code>DemoEip</code></li>
     * <li>Parameters.2.ParameterValue: <code>public</code></li>
     * </ul>
     * <blockquote>
     * <p> The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>ts-aa9c62feab844a6b****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The region ID of the scenario. The default value is the same as the value of the RegionId parameter.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TemplateScratchRegionId")
    public String templateScratchRegionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The ID of the scenario.</p>
     * <p>For more information about how to query the IDs of scenarios, see <a href="https://help.aliyun.com/document_detail/363050.html">ListTemplateScratches</a>.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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

    public GetTemplateEstimateCostRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
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
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>Details of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoEip</p>
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
