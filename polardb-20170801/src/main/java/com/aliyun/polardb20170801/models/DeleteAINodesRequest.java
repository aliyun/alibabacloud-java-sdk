// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAINodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBNodeId")
    public java.util.List<String> DBNodeId;

    public static DeleteAINodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAINodesRequest self = new DeleteAINodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAINodesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAINodesRequest setDBNodeId(java.util.List<String> DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public java.util.List<String> getDBNodeId() {
        return this.DBNodeId;
    }

}
