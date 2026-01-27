// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class OperateNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>lingjunxxxx-mgxxx-xxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>96496E6E-00B4-5F55-80F6-1844FA9E92DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateNodeResponseBody self = new OperateNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateNodeResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OperateNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
