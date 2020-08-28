// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("Ipv6CidrBlock")
    @Validation(required = true)
    public String ipv6CidrBlock;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("AvailableIpAddressCount")
    @Validation(required = true)
    public Long availableIpAddressCount;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("VSwitchName")
    @Validation(required = true)
    public String vSwitchName;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("IsDefault")
    @Validation(required = true)
    public Boolean isDefault;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

    @NameInMap("ShareType")
    @Validation(required = true)
    public String shareType;

    @NameInMap("RouteTable")
    @Validation(required = true)
    public DescribeVSwitchAttributesResponseRouteTable routeTable;

    public static DescribeVSwitchAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponse self = new DescribeVSwitchAttributesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVSwitchAttributesResponseRouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        public static DescribeVSwitchAttributesResponseRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseRouteTable self = new DescribeVSwitchAttributesResponseRouteTable();
            return TeaModel.build(map, self);
        }

    }

}
