// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCustomerGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewaysRequest self = new DescribeCustomerGatewaysRequest();
        return TeaModel.build(map, self);
    }

}
