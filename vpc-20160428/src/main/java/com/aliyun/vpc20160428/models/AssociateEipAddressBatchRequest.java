// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressBatchRequest extends TeaModel {
    /**
     * <p>The ID of the instance with which you want to associate the EIPs.</p>
     * <p>The instance can be a NAT gateway or a secondary ENI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-hp3akk9irtd69jad****</p>
     */
    @NameInMap("BindedInstanceId")
    public String bindedInstanceId;

    /**
     * <p>The type of the instance with which you want to associate the EIPs. Valid values:</p>
     * <ul>
     * <li><strong>Nat</strong>: NAT gateway</li>
     * <li><strong>NetworkInterface</strong>: secondary ENI</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Nat</p>
     */
    @NameInMap("BindedInstanceType")
    public String bindedInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The EIPs to be associated with the instance.</p>
     * <p>You must enter at least one EIP. You can enter up to 50 EIPs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The association mode. Set the value to <strong>MULTI_BINDED</strong>, which specifies the Multi-EIP-to-ENI mode.</p>
     * <p>This parameter is required only when <strong>BindedInstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the EIPs belong. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssociateEipAddressBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressBatchRequest self = new AssociateEipAddressBatchRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressBatchRequest setBindedInstanceId(String bindedInstanceId) {
        this.bindedInstanceId = bindedInstanceId;
        return this;
    }
    public String getBindedInstanceId() {
        return this.bindedInstanceId;
    }

    public AssociateEipAddressBatchRequest setBindedInstanceType(String bindedInstanceType) {
        this.bindedInstanceType = bindedInstanceType;
        return this;
    }
    public String getBindedInstanceType() {
        return this.bindedInstanceType;
    }

    public AssociateEipAddressBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateEipAddressBatchRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AssociateEipAddressBatchRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AssociateEipAddressBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateEipAddressBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
