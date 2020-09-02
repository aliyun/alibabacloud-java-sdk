// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    public static DescribeCustomerGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewayRequest self = new DescribeCustomerGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCustomerGatewayRequest setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

}
