// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze450g4ctg6t****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the created node. The value is a string. Multiple values are separated by commas (<code>,</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>rn-abcd2*****</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>2133400000*****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesResponseBody self = new CreateDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBNodesResponseBody setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateDBNodesResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
