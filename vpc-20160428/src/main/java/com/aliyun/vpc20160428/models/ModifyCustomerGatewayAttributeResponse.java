// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    public static ModifyCustomerGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerGatewayAttributeResponse self = new ModifyCustomerGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

}
