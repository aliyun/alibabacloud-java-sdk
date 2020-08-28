// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponse extends TeaModel {
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

    @NameInMap("Vpcs")
    @Validation(required = true)
    public DescribeVpcsResponseVpcs vpcs;

    public static DescribeVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponse self = new DescribeVpcsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpcsResponseVpcsVpcTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVpcsResponseVpcsVpcTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcTagsTag self = new DescribeVpcsResponseVpcsVpcTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpcTagsTag> tag;

        public static DescribeVpcsResponseVpcsVpcTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcTags self = new DescribeVpcsResponseVpcsVpcTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcVSwitchIds self = new DescribeVpcsResponseVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcUserCidrs extends TeaModel {
        // UserCidr
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcUserCidrs self = new DescribeVpcsResponseVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcNatGatewayIds extends TeaModel {
        // NatGatewayIds
        @NameInMap("NatGatewayIds")
        @Validation(required = true)
        public java.util.List<String> natGatewayIds;

        public static DescribeVpcsResponseVpcsVpcNatGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcNatGatewayIds self = new DescribeVpcsResponseVpcsVpcNatGatewayIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcRouterTableIds extends TeaModel {
        // RouterTableIds
        @NameInMap("RouterTableIds")
        @Validation(required = true)
        public java.util.List<String> routerTableIds;

        public static DescribeVpcsResponseVpcsVpcRouterTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcRouterTableIds self = new DescribeVpcsResponseVpcsVpcRouterTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks extends TeaModel {
        // SecondaryCidrBlock
        @NameInMap("SecondaryCidrBlock")
        @Validation(required = true)
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks self = new DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpc extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("Ipv6CidrBlock")
        @Validation(required = true)
        public String ipv6CidrBlock;

        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("NetworkAclNum")
        @Validation(required = true)
        public String networkAclNum;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("CenStatus")
        @Validation(required = true)
        public String cenStatus;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("SupportAdvancedFeature")
        @Validation(required = true)
        public Boolean supportAdvancedFeature;

        @NameInMap("AdvancedResource")
        @Validation(required = true)
        public Boolean advancedResource;

        @NameInMap("DhcpOptionsSetId")
        @Validation(required = true)
        public String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetStatus")
        @Validation(required = true)
        public String dhcpOptionsSetStatus;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcTags tags;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("UserCidrs")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcUserCidrs userCidrs;

        @NameInMap("NatGatewayIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcNatGatewayIds natGatewayIds;

        @NameInMap("RouterTableIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcRouterTableIds routerTableIds;

        @NameInMap("SecondaryCidrBlocks")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks;

        public static DescribeVpcsResponseVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpc self = new DescribeVpcsResponseVpcsVpc();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcs extends TeaModel {
        @NameInMap("Vpc")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpc> vpc;

        public static DescribeVpcsResponseVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcs self = new DescribeVpcsResponseVpcs();
            return TeaModel.build(map, self);
        }

    }

}
