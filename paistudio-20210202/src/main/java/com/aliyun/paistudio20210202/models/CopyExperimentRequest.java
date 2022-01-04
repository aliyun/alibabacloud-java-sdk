// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CopyExperimentRequest extends TeaModel {
    // 工作空间内可见性 PUBLIC; PRIVATE 默认PUBLIC
    @NameInMap("Accessibility")
    public String accessibility;

    // 实验描述
    @NameInMap("Description")
    public String description;

    // 实验创建的目录 id
    @NameInMap("FolderId")
    public String folderId;

    // 实验名称，最大长度 128，可包含中英文
    @NameInMap("Name")
    public String name;

    // 实验来源，目前 PaiStudio，data-airec（推荐白盒）
    @NameInMap("Source")
    public String source;

    // 实验创建的Workspace
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CopyExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyExperimentRequest self = new CopyExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CopyExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CopyExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CopyExperimentRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CopyExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyExperimentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CopyExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
