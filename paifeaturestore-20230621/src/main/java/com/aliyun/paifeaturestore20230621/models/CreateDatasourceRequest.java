// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateDatasourceRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceRequest self = new CreateDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatasourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateDatasourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
