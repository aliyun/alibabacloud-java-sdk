// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the network ACL.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the network ACL.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("NetworkAclName")
    public String networkAclName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the network ACL.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the network ACL belongs.</p>
     * <br>
     * <p>If the VPC contains Elastic Compute Service (ECS) instances of the following instance families, you must upgrade the ECS instances or release the ECS instances. Otherwise, you cannot create a network ACL for the VPC.</p>
     * <br>
     * <p>ecs.c1, ecs.c2, ecs.c4, ecs.c5, ecs.ce4, ecs.cm4, ecs.d1, ecs.e3, ecs.e4, ecs.ga1, ecs.gn4, ecs.gn5, ecs.i1, ecs.m1, ecs.m2, ecs.mn4, ecs.n1, ecs.n2, ecs.n4, ecs.s1, ecs.s2, ecs.s3, ecs.se1, ecs.sn1, ecs.sn2, ecs.t1, and ecs.xn4.</p>
     * <br>
     * <p>*   For more information about how to upgrade an ECS instance, see [Upgrade subscription instances](~~25438~~) and [Change the specifications of pay-as-you-go instances](~~60051~~).</p>
     * <p>*   For more information about how to release an ECS instance, see [Release an ECS instance](~~25442~~).</p>
     * <br>
     * <p>>  If your VPC contains ECS instances of the preceding instance families and you create a network ACL for the VPC, you must upgrade the ECS instances. Otherwise, the network ACL cannot work as expected.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclRequest self = new CreateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkAclRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkAclRequest setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }
    public String getNetworkAclName() {
        return this.networkAclName;
    }

    public CreateNetworkAclRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkAclRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNetworkAclRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNetworkAclRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
