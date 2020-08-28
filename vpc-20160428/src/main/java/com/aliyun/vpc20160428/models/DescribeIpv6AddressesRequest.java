// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    @NameInMap("Ipv6Address")
    public String ipv6Address;

    @NameInMap("Name")
    public String name;

    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesRequest self = new DescribeIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

}
