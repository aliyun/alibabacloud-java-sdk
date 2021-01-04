// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayClientUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmartAccessGatewayClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartAccessGatewayClientUserResponseBody self = new DeleteSmartAccessGatewayClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmartAccessGatewayClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
