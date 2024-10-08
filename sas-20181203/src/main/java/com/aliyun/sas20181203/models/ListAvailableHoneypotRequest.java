// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the management node to which the honeypot is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>4341018b-8e01-43f6-b1d2-af29a2a4****</p>
     */
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
