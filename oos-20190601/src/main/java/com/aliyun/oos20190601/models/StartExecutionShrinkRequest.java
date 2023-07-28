// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionShrinkRequest extends TeaModel {
    /**
     * <p>The access token.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the execution.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The loop mode. Valid values:</p>
     * <br>
     * <p>*   Automatic: does not suspend the execution of the template. This is the default value.</p>
     * <p>*   FirstBatchPause: suspends the execution of the template after the first batch is complete.</p>
     * <p>*   EveryBatchPause: suspends the execution of the template after each batch is complete.</p>
     */
    @NameInMap("LoopMode")
    public String loopMode;

    /**
     * <p>The execution mode. Valid values:</p>
     * <br>
     * <p>*   Automatic: automatically starts the execution of the template. This is the default value.</p>
     * <p>*   FailurePause: suspends the execution of the template upon a failure.</p>
     * <p>*   Debug: manually starts the execution of the template.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The JSON string that consists of a set of parameters. Default value: {}.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the parent execution.</p>
     */
    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    /**
     * <p>The ID of the region in which the execution resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security check mode. Valid values:</p>
     * <br>
     * <p>*   Skip: specifies that you are aware of the risks. The system performs all actions in the execution without manual confirmation, regardless of the risk level. This parameter is valid only if the `Mode` parameter is set to Automatic.</p>
     * <p>*   ConfirmEveryHighRiskAction: requires you to confirm each high-risk action. This is the default value. You can call the **NotifyExecution** operation to confirm or cancel an action.</p>
     */
    @NameInMap("SafetyCheck")
    public String safetyCheck;

    /**
     * <p>The tags for the execution.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The content of the template in the JSON or YAML format. This parameter is the same as the Content parameter that you can specify when you call the CreateTemplate operation. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The Object Storage Service (OSS) URL of the object that stores the content of the Operation Orchestration Service (OOS) template. The access control list (ACL) of the object must be public-read. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version number of the template. If you do not specify this parameter, the system uses the latest version.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static StartExecutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionShrinkRequest self = new StartExecutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartExecutionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartExecutionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartExecutionShrinkRequest setLoopMode(String loopMode) {
        this.loopMode = loopMode;
        return this;
    }
    public String getLoopMode() {
        return this.loopMode;
    }

    public StartExecutionShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public StartExecutionShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public StartExecutionShrinkRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public StartExecutionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartExecutionShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StartExecutionShrinkRequest setSafetyCheck(String safetyCheck) {
        this.safetyCheck = safetyCheck;
        return this;
    }
    public String getSafetyCheck() {
        return this.safetyCheck;
    }

    public StartExecutionShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public StartExecutionShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public StartExecutionShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public StartExecutionShrinkRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public StartExecutionShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
