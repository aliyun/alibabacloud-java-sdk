// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Details about the nodes.</p>
     */
    @NameInMap("DBNodeIds")
    public CreateDBNodesResponseBodyDBNodeIds DBNodeIds;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesResponseBody self = new CreateDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBNodesResponseBody setDBNodeIds(CreateDBNodesResponseBodyDBNodeIds DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public CreateDBNodesResponseBodyDBNodeIds getDBNodeIds() {
        return this.DBNodeIds;
    }

    public CreateDBNodesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBNodesResponseBodyDBNodeIds extends TeaModel {
        @NameInMap("DBNodeId")
        public java.util.List<String> DBNodeId;

        public static CreateDBNodesResponseBodyDBNodeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesResponseBodyDBNodeIds self = new CreateDBNodesResponseBodyDBNodeIds();
            return TeaModel.build(map, self);
        }

        public CreateDBNodesResponseBodyDBNodeIds setDBNodeId(java.util.List<String> DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public java.util.List<String> getDBNodeId() {
            return this.DBNodeId;
        }

    }

}
