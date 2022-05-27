// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkspaceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
