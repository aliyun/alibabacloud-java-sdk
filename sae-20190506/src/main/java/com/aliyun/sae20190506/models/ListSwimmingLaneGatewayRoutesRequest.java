// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGatewayRoutesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gw-277c0727535f4aae917e48de0f******</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListSwimmingLaneGatewayRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGatewayRoutesRequest self = new ListSwimmingLaneGatewayRoutesRequest();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGatewayRoutesRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ListSwimmingLaneGatewayRoutesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
