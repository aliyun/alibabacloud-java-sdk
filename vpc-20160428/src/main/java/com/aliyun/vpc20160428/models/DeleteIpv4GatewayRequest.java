// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv4GatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without deleting the IPv4 gateway. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the HTTP 2xx status code is returned and the IPv4 gateway is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The public network pattern of the VPC after the IPv4 gateway is deleted. Valid values:</p>
     * <ul>
     * <li><strong>private</strong>: the default value. After the IPv4 gateway is deleted, the VPC becomes a purely private network VPC and does not have public network access capabilities.</li>
     * <li><strong>public</strong>: After the IPv4 gateway is deleted, public network access to the VPC is no longer centrally controlled by the IPv4 gateway. By default, after a public IP address is associated with an instance, the instance can directly access the public network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("InternetMode")
    public String internetMode;

    /**
     * <p>The instance ID of the IPv4 gateway to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the IPv4 gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-6</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteIpv4GatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv4GatewayRequest self = new DeleteIpv4GatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpv4GatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpv4GatewayRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteIpv4GatewayRequest setInternetMode(String internetMode) {
        this.internetMode = internetMode;
        return this;
    }
    public String getInternetMode() {
        return this.internetMode;
    }

    public DeleteIpv4GatewayRequest setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public DeleteIpv4GatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteIpv4GatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteIpv4GatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpv4GatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteIpv4GatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
