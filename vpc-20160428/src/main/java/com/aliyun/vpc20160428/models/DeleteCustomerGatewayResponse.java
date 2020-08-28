// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCustomerGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCustomerGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerGatewayResponse self = new DeleteCustomerGatewayResponse();
        return TeaModel.build(map, self);
    }

}
