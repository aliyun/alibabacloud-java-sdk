// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpv4GatewayAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpv4GatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpv4GatewayAttributeResponseBody self = new UpdateIpv4GatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpv4GatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
