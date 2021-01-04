// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartExecutionShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("LoopMode")
    public String loopMode;

    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    @NameInMap("SafetyCheck")
    public String safetyCheck;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateContent")
    public String templateContent;

    public static StartExecutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionShrinkRequest self = new StartExecutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartExecutionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartExecutionShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public StartExecutionShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public StartExecutionShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public StartExecutionShrinkRequest setLoopMode(String loopMode) {
        this.loopMode = loopMode;
        return this;
    }
    public String getLoopMode() {
        return this.loopMode;
    }

    public StartExecutionShrinkRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public StartExecutionShrinkRequest setSafetyCheck(String safetyCheck) {
        this.safetyCheck = safetyCheck;
        return this;
    }
    public String getSafetyCheck() {
        return this.safetyCheck;
    }

    public StartExecutionShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public StartExecutionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartExecutionShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public StartExecutionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartExecutionShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

}
