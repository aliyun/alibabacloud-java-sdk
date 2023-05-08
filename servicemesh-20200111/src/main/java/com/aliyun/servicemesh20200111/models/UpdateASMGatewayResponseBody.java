// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateASMGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayResponseBody self = new UpdateASMGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
