// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("ClassicLinkEnabled")
    @Validation(required = true)
    public Boolean classicLinkEnabled;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("NetworkAclNum")
    @Validation(required = true)
    public String networkAclNum;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetStatus")
    @Validation(required = true)
    public String dhcpOptionsSetStatus;

    @NameInMap("AssociatedCens")
    @Validation(required = true)
    public DescribeVpcAttributeResponseAssociatedCens associatedCens;

    @NameInMap("CloudResources")
    @Validation(required = true)
    public DescribeVpcAttributeResponseCloudResources cloudResources;

    @NameInMap("VSwitchIds")
    @Validation(required = true)
    public DescribeVpcAttributeResponseVSwitchIds vSwitchIds;

    @NameInMap("UserCidrs")
    @Validation(required = true)
    public DescribeVpcAttributeResponseUserCidrs userCidrs;

    @NameInMap("SecondaryCidrBlocks")
    @Validation(required = true)
    public DescribeVpcAttributeResponseSecondaryCidrBlocks secondaryCidrBlocks;

    public static DescribeVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAttributeResponse self = new DescribeVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpcAttributeResponseAssociatedCensAssociatedCen extends TeaModel {
        @NameInMap("CenId")
        @Validation(required = true)
        public String cenId;

        @NameInMap("CenOwnerId")
        @Validation(required = true)
        public Long cenOwnerId;

        @NameInMap("CenStatus")
        @Validation(required = true)
        public String cenStatus;

        public static DescribeVpcAttributeResponseAssociatedCensAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseAssociatedCensAssociatedCen self = new DescribeVpcAttributeResponseAssociatedCensAssociatedCen();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseAssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        @Validation(required = true)
        public java.util.List<DescribeVpcAttributeResponseAssociatedCensAssociatedCen> associatedCen;

        public static DescribeVpcAttributeResponseAssociatedCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseAssociatedCens self = new DescribeVpcAttributeResponseAssociatedCens();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType extends TeaModel {
        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceCount")
        @Validation(required = true)
        public Integer resourceCount;

        public static DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType self = new DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseCloudResources extends TeaModel {
        @NameInMap("CloudResourceSetType")
        @Validation(required = true)
        public java.util.List<DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType> cloudResourceSetType;

        public static DescribeVpcAttributeResponseCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseCloudResources self = new DescribeVpcAttributeResponseCloudResources();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcAttributeResponseVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseVSwitchIds self = new DescribeVpcAttributeResponseVSwitchIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcAttributeResponseUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseUserCidrs self = new DescribeVpcAttributeResponseUserCidrs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcAttributeResponseSecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        @Validation(required = true)
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcAttributeResponseSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseSecondaryCidrBlocks self = new DescribeVpcAttributeResponseSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

    }

}
