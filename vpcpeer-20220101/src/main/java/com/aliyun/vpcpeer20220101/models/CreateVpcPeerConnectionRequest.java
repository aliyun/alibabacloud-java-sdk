// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class CreateVpcPeerConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the accepter VPC belongs.</p>
     * <br>
     * <p>*   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.</p>
     * <br>
     * <p>*   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.</p>
     * <br>
     * <p>> If the accepter VPC belongs to a Resource Access Management (RAM) user, you must set the value of **AcceptingAliUid** to the ID of the corresponding Alibaba Cloud account.</p>
     */
    @NameInMap("AcceptingAliUid")
    public Long acceptingAliUid;

    /**
     * <p>The region ID of the accepter VPC of the VPC peering connection that you want to create.</p>
     * <br>
     * <p>*   To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.</p>
     * <p>*   To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.</p>
     */
    @NameInMap("AcceptingRegionId")
    public String acceptingRegionId;

    /**
     * <p>The ID of the accepter VPC.</p>
     */
    @NameInMap("AcceptingVpcId")
    public String acceptingVpcId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **client token** as the **request ID**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VPC peering connection.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the VPC peering connection.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where you want to create a VPC peering connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [What is a resource group?](~~94475~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the requester VPC.</p>
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

    public CreateVpcPeerConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
