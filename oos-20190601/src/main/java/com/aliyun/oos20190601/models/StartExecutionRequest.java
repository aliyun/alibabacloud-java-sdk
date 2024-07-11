// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionRequest extends TeaModel {
    /**
     * <p>The access token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e56767-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>test execution.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The loop mode. Valid values:</p>
     * <ul>
     * <li>Automatic: does not suspend the execution of the template. This is the default value.</li>
     * <li>FirstBatchPause: suspends the execution of the template after the first batch is complete.</li>
     * <li>EveryBatchPause: suspends the execution of the template after each batch is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automatic</p>
     */
    @NameInMap("LoopMode")
    public String loopMode;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li>Automatic: automatically starts the execution of the template. This is the default value.</li>
     * <li>FailurePause: suspends the execution of the template upon a failure.</li>
     * <li>Debug: manually starts the execution of the template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automatic</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The JSON string that consists of a set of parameters. Default value: {}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Status&quot;:&quot;Running&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the parent execution.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    /**
     * <p>The ID of the region in which the execution resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security check mode. Valid values:</p>
     * <ul>
     * <li>Skip: specifies that you are aware of the risks. The system performs all actions in the execution without manual confirmation, regardless of the risk level. This parameter is valid only if the <code>Mode</code> parameter is set to Automatic.</li>
     * <li>ConfirmEveryHighRiskAction: requires you to confirm each high-risk action. This is the default value. You can call the <strong>NotifyExecution</strong> operation to confirm or cancel an action.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Skip</p>
     */
    @NameInMap("SafetyCheck")
    public String safetyCheck;

    /**
     * <p>The tags for the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The content of the template in the JSON or YAML format. This parameter is the same as the Content parameter that you can specify when you call the CreateTemplate operation. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;Description&quot;: &quot;Example template, describe instances in some status&quot;,   &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;,   &quot;Parameters&quot;: {},   &quot;Tasks&quot;: [     {       &quot;Name&quot;: &quot;describeInstances&quot;,       &quot;Action&quot;: &quot;ACS::ExecuteAPI&quot;,       &quot;Description&quot;: &quot;desc-en&quot;,       &quot;Properties&quot;: {         &quot;Service&quot;: &quot;ECS&quot;,         &quot;API&quot;: &quot;DescribeInstances&quot;,         &quot;Parameters&quot;: {           &quot;Status&quot;: &quot;Running&quot;         }       }     }   ] }</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>vmeixme</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The Object Storage Service (OSS) URL of the object that stores the content of the Operation Orchestration Service (OOS) template. The access control list (ACL) of the object must be public-read. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json">http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json</a></p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version number of the template. If you do not specify this parameter, the system uses the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static StartExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionRequest self = new StartExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartExecutionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartExecutionRequest setLoopMode(String loopMode) {
        this.loopMode = loopMode;
        return this;
    }
    public String getLoopMode() {
        return this.loopMode;
    }

    public StartExecutionRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public StartExecutionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public StartExecutionRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public StartExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartExecutionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StartExecutionRequest setSafetyCheck(String safetyCheck) {
        this.safetyCheck = safetyCheck;
        return this;
    }
    public String getSafetyCheck() {
        return this.safetyCheck;
    }

    public StartExecutionRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public StartExecutionRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public StartExecutionRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public StartExecutionRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public StartExecutionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
