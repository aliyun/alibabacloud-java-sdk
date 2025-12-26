// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Toolset extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Tools")
    public String tools;

    @NameInMap("ToolsetConfig")
    public String toolsetConfig;

    @NameInMap("ToolsetId")
    public String toolsetId;

    @NameInMap("ToolsetName")
    public String toolsetName;

    @NameInMap("ToolsetType")
    public String toolsetType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Toolset build(java.util.Map<String, ?> map) throws Exception {
        Toolset self = new Toolset();
        return TeaModel.build(map, self);
    }

    public Toolset setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Toolset setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Toolset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Toolset setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Toolset setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Toolset setTools(String tools) {
        this.tools = tools;
        return this;
    }
    public String getTools() {
        return this.tools;
    }

    public Toolset setToolsetConfig(String toolsetConfig) {
        this.toolsetConfig = toolsetConfig;
        return this;
    }
    public String getToolsetConfig() {
        return this.toolsetConfig;
    }

    public Toolset setToolsetId(String toolsetId) {
        this.toolsetId = toolsetId;
        return this;
    }
    public String getToolsetId() {
        return this.toolsetId;
    }

    public Toolset setToolsetName(String toolsetName) {
        this.toolsetName = toolsetName;
        return this;
    }
    public String getToolsetName() {
        return this.toolsetName;
    }

    public Toolset setToolsetType(String toolsetType) {
        this.toolsetType = toolsetType;
        return this;
    }
    public String getToolsetType() {
        return this.toolsetType;
    }

    public Toolset setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
