// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("RouteEntryId")
    public String routeEntryId;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("RouteEntryName")
    public String routeEntryName;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("RouteEntryType")
    public String routeEntryType;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("MaxResult")
    public Integer maxResult;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeRouteEntryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListRequest self = new DescribeRouteEntryListRequest();
        return TeaModel.build(map, self);
    }

}
