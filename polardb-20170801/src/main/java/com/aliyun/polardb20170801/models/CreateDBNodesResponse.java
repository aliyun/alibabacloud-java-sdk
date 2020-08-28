// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("DBNodeIds")
    @Validation(required = true)
    public CreateDBNodesResponseDBNodeIds DBNodeIds;

    public static CreateDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesResponse self = new CreateDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateDBNodesResponseDBNodeIds extends TeaModel {
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public java.util.List<String> DBNodeId;

        public static CreateDBNodesResponseDBNodeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesResponseDBNodeIds self = new CreateDBNodesResponseDBNodeIds();
            return TeaModel.build(map, self);
        }

    }

}
