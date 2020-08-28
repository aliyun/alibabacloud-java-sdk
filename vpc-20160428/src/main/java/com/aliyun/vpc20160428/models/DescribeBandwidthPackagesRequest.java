// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesRequest self = new DescribeBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

}
