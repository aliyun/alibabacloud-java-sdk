// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCustomerGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Asn")
    public String asn;

    public static CreateCustomerGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerGatewayRequest self = new CreateCustomerGatewayRequest();
        return TeaModel.build(map, self);
    }

}
