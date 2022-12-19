// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    public static GetHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeRequest self = new GetHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
