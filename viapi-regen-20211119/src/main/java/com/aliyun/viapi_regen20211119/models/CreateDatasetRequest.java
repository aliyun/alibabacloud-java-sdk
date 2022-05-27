// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    // 描述
    @NameInMap("Description")
    public String description;

    // 数据集名称
    @NameInMap("Name")
    public String name;

    // 类型
    @NameInMap("Type")
    public String type;

    // 空间id
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatasetRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
