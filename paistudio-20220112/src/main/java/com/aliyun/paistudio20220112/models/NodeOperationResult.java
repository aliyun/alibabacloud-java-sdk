// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeOperationResult extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("Status")
    public String status;

    public static NodeOperationResult build(java.util.Map<String, ?> map) throws Exception {
        NodeOperationResult self = new NodeOperationResult();
        return TeaModel.build(map, self);
    }

    public NodeOperationResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NodeOperationResult setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public NodeOperationResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
