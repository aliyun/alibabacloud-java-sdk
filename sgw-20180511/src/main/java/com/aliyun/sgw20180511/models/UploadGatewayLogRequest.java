// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UploadGatewayLogRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    public static UploadGatewayLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadGatewayLogRequest self = new UploadGatewayLogRequest();
        return TeaModel.build(map, self);
    }

    public UploadGatewayLogRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
