// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotNodeRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    public static DeleteHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotNodeRequest self = new DeleteHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
