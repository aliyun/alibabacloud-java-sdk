// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteNodeGroupParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // description
    @NameInMap("description")
    public String description;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    public static DeleteNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeGroupParam self = new DeleteNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public DeleteNodeGroupParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodeGroupParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
