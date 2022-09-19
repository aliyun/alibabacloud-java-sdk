// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    public static ListAvailableHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableHoneypotRequest self = new ListAvailableHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableHoneypotRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
