// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateASMGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateASMGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateASMGatewayResponseBody self = new CreateASMGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateASMGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
