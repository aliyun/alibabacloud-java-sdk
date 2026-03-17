// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayClientUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>09AD82DC-FE26-4B66-B526-2FA6BE82A4D3</p>
     */
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
