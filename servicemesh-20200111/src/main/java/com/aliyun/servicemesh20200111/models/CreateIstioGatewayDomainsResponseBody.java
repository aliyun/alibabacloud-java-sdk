// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIstioGatewayDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayDomainsResponseBody self = new CreateIstioGatewayDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
