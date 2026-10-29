// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class CreateVpcPeerConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the acceptor of the VPC peering connection belongs.</p>
     * <ul>
     * <li><p>If you enter your own Alibaba Cloud account ID, a same-account VPC peering connection is created.</p>
     * </li>
     * <li><p>If you enter the ID of another Alibaba Cloud account, a cross-account VPC peering connection is created.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the acceptor account is a Resource Access Management (RAM) user, you must enter the ID of the Alibaba Cloud account to which the RAM user belongs in <strong>AcceptingAliUid</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("AcceptingAliUid")
    public Long acceptingAliUid;

    /**
     * <p>The ID of the region where the acceptor of the VPC peering connection is deployed.</p>
     * <ul>
     * <li><p>To create an intra-region VPC peering connection, enter the same region ID as the initiator.</p>
     * </li>
     * <li><p>To create an inter-region VPC peering connection, enter a region ID different from that of the initiator.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AcceptingRegionId")
    public String acceptingRegionId;

    /**
     * <p>The ID of the VPC that acts as the acceptor of the VPC peering connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vzjkp2q1xgnind****</p>
     */
    @NameInMap("AcceptingVpcId")
    public String acceptingVpcId;

    /**
     * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be a positive integer.</p>
     * <blockquote>
     * <p>If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VPC peering connection. The description must be 2 to 256 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run for this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not create a VPC peering connection. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a Normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable the jumbo frame feature for the VPC peering connection. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.<blockquote>
     * <p>Note: If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The link type.</p>
     * <p>Valid values: Platinum and Gold. Default value: Gold.</p>
     * <blockquote>
     * <p>If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Gold</p>
     */
    @NameInMap("LinkType")
    public String linkType;

    /**
     * <p>The name of the VPC peering connection. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>vpcpeer</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where you want to create a VPC peering connection. </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    /**
     * <p>The ID create a VPC that acts as the initiator create a VPC peering connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1gsk7h12ew7oegk****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPeerConnectionRequest self = new CreateVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcPeerConnectionRequest setAcceptingAliUid(Long acceptingAliUid) {
        this.acceptingAliUid = acceptingAliUid;
        return this;
    }
    public Long getAcceptingAliUid() {
        return this.acceptingAliUid;
    }

    public CreateVpcPeerConnectionRequest setAcceptingRegionId(String acceptingRegionId) {
        this.acceptingRegionId = acceptingRegionId;
        return this;
    }
    public String getAcceptingRegionId() {
        return this.acceptingRegionId;
    }

    public CreateVpcPeerConnectionRequest setAcceptingVpcId(String acceptingVpcId) {
        this.acceptingVpcId = acceptingVpcId;
        return this;
    }
    public String getAcceptingVpcId() {
        return this.acceptingVpcId;
    }

    public CreateVpcPeerConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcPeerConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcPeerConnectionRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public CreateVpcPeerConnectionRequest setLinkType(String linkType) {
        this.linkType = linkType;
        return this;
    }
    public String getLinkType() {
        return this.linkType;
    }

    public CreateVpcPeerConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpcPeerConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcPeerConnectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcPeerConnectionRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateVpcPeerConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class Tag extends TeaModel {
        /**
         * <p>The tag key of the resource. You must specify at least one tag key and can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You must specify at least one tag value and can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
