// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateCommandShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_axaxaaa</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>659864545</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shopping_t</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ToolDescription")
    public String toolDescription;

    @NameInMap("ToolExamples")
    public String toolExamplesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open_bx</p>
     */
    @NameInMap("ToolName")
    public String toolName;

    @NameInMap("ToolParams")
    public String toolParamsShrink;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandShrinkRequest self = new CreateCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommandShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCommandShrinkRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CreateCommandShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCommandShrinkRequest setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
        return this;
    }
    public String getToolDescription() {
        return this.toolDescription;
    }

    public CreateCommandShrinkRequest setToolExamplesShrink(String toolExamplesShrink) {
        this.toolExamplesShrink = toolExamplesShrink;
        return this;
    }
    public String getToolExamplesShrink() {
        return this.toolExamplesShrink;
    }

    public CreateCommandShrinkRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public CreateCommandShrinkRequest setToolParamsShrink(String toolParamsShrink) {
        this.toolParamsShrink = toolParamsShrink;
        return this;
    }
    public String getToolParamsShrink() {
        return this.toolParamsShrink;
    }

    public CreateCommandShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
