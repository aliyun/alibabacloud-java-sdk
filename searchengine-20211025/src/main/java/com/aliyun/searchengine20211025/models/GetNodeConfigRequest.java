// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigRequest extends TeaModel {
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

    public static GetNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeConfigRequest self = new GetNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeConfigRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetNodeConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public GetNodeConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNodeConfigRequest setTableDeployId(String tableDeployId) {
        this.tableDeployId = tableDeployId;
        return this;
    }
    public String getTableDeployId() {
        return this.tableDeployId;
    }

    public GetNodeConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
