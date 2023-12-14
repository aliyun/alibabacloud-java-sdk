// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandGatewayFileShareRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    public static ExpandGatewayFileShareRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandGatewayFileShareRequest self = new ExpandGatewayFileShareRequest();
        return TeaModel.build(map, self);
    }

    public ExpandGatewayFileShareRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ExpandGatewayFileShareRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

}
