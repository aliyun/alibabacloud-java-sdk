// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyNodeConfigRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    @NameInMap("clusterName")
    public String clusterName;

    @NameInMap("dataSourceName")
    public String dataSourceName;

    @NameInMap("name")
    public String name;

    @NameInMap("tableDeployId")
    public String tableDeployId;

    @NameInMap("type")
    public String type;

    public static ModifyNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeConfigRequest self = new ModifyNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeConfigRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ModifyNodeConfigRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyNodeConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ModifyNodeConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyNodeConfigRequest setTableDeployId(String tableDeployId) {
        this.tableDeployId = tableDeployId;
        return this;
    }
    public String getTableDeployId() {
        return this.tableDeployId;
    }

    public ModifyNodeConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
