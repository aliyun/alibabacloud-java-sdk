// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCustomerGatewayResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomerGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerGatewayResponseBody self = new DeleteCustomerGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomerGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
