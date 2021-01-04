// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartAccessGatewayResponseBody self = new DeleteSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
