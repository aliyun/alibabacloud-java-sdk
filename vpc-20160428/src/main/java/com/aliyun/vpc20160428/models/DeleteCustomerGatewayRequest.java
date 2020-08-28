// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCustomerGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    public static DeleteCustomerGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerGatewayRequest self = new DeleteCustomerGatewayRequest();
        return TeaModel.build(map, self);
    }

}
