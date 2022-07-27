// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("LoopMode")
    public String loopMode;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SafetyCheck")
    public String safetyCheck;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("TemplateName")
    public String templateName;

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

    public StartExecutionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
