// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("ServiceLocation")
    public String serviceLocation;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGlobalAccelerationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesRequest self = new DescribeGlobalAccelerationInstancesRequest();
        return TeaModel.build(map, self);
    }

}
