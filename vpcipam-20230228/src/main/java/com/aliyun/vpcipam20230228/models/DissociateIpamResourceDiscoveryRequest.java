// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DissociateIpamResourceDiscoveryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Performs a dry run without disassociating the resource discovery and IPAM instance. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): Performs a dry run and sends the request. After the request passes the check, an HTTP 2xx status code is returned and the resource discovery and IPAM instances are disassociated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the IPAM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <p>The ID of the resource discovery instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
     */
    @NameInMap("IpamResourceDiscoveryId")
    public String ipamResourceDiscoveryId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The request region.</p>
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

    public static DissociateIpamResourceDiscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpamResourceDiscoveryRequest self = new DissociateIpamResourceDiscoveryRequest();
        return TeaModel.build(map, self);
    }

    public DissociateIpamResourceDiscoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateIpamResourceDiscoveryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateIpamResourceDiscoveryRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public DissociateIpamResourceDiscoveryRequest setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
        return this;
    }
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    public DissociateIpamResourceDiscoveryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DissociateIpamResourceDiscoveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DissociateIpamResourceDiscoveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateIpamResourceDiscoveryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DissociateIpamResourceDiscoveryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
