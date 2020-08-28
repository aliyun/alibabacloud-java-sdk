// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VSwitches")
    @Validation(required = true)
    public DescribeVSwitchesResponseVSwitches vSwitches;

    public static DescribeVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponse self = new DescribeVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVSwitchesResponseVSwitchesVSwitchTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchTagsTag self = new DescribeVSwitchesResponseVSwitchesVSwitchTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitchTagsTag> tag;

        public static DescribeVSwitchesResponseVSwitchesVSwitchTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchTags self = new DescribeVSwitchesResponseVSwitchesVSwitchTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchRouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        public static DescribeVSwitchesResponseVSwitchesVSwitchRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchRouteTable self = new DescribeVSwitchesResponseVSwitchesVSwitchRouteTable();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitch extends TeaModel {
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

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeVSwitchesResponseVSwitchesVSwitchTags tags;

        @NameInMap("RouteTable")
        @Validation(required = true)
        public DescribeVSwitchesResponseVSwitchesVSwitchRouteTable routeTable;

        public static DescribeVSwitchesResponseVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitch self = new DescribeVSwitchesResponseVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVSwitchesResponseVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchesResponseVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitches self = new DescribeVSwitchesResponseVSwitches();
            return TeaModel.build(map, self);
        }

    }

}
