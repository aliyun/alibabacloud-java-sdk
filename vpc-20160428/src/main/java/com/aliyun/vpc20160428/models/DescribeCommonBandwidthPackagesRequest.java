// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesRequest extends TeaModel {
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DescribeCommonBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonBandwidthPackagesRequest self = new DescribeCommonBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

}
