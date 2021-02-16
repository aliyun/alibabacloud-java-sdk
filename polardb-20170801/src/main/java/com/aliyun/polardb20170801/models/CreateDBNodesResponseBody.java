// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesResponseBody extends TeaModel {
    @NameInMap("DBNodeIds")
    public CreateDBNodesResponseBodyDBNodeIds DBNodeIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesResponseBody self = new CreateDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesResponseBody setDBNodeIds(CreateDBNodesResponseBodyDBNodeIds DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public CreateDBNodesResponseBodyDBNodeIds getDBNodeIds() {
        return this.DBNodeIds;
    }

    public CreateDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDBNodesResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBNodesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
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
