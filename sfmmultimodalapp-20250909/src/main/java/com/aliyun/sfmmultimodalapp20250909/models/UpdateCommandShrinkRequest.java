// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateCommandShrinkRequest extends TeaModel {
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
     * <p>8293382932xxx</p>
     */
    @NameInMap("ToolId")
    public String toolId;

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

    public static UpdateCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommandShrinkRequest self = new UpdateCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommandShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCommandShrinkRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public UpdateCommandShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCommandShrinkRequest setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
        return this;
    }
    public String getToolDescription() {
        return this.toolDescription;
    }

    public UpdateCommandShrinkRequest setToolExamplesShrink(String toolExamplesShrink) {
        this.toolExamplesShrink = toolExamplesShrink;
        return this;
    }
    public String getToolExamplesShrink() {
        return this.toolExamplesShrink;
    }

    public UpdateCommandShrinkRequest setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public UpdateCommandShrinkRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public UpdateCommandShrinkRequest setToolParamsShrink(String toolParamsShrink) {
        this.toolParamsShrink = toolParamsShrink;
        return this;
    }
    public String getToolParamsShrink() {
        return this.toolParamsShrink;
    }

    public UpdateCommandShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
