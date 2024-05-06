// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigRequest extends TeaModel {
    /**
     * <p>The name of the cluster</p>
     */
    @NameInMap("clusterName")
    public String clusterName;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the node. Valid values: qrs, search, index, and cluster. qrs indicates a query node, search indicates a data node, index indicates an index node, and cluster indicates a cluster node.</p>
     */
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

    public GetNodeConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNodeConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
