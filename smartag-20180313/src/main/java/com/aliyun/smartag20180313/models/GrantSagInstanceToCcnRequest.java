// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToCcnRequest extends TeaModel {
    /**
     * <p>The ID of the CCN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-n2935s1mnwv8i*****</p>
     */
    @NameInMap("CcnInstanceId")
    public String ccnInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the CCN instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("CcnUid")
    public Long ccnUid;

    /**
     * <p>Specifies whether to grant the CCN instance permissions to manage network traffic from the SAG instance.</p>
     * <p>After the CCN instance is granted the permissions, the CCN instance can redirect the network traffic sent from the SAG instance to the Internet to Cloud Security Access Service (CSAS) for security audit.</p>
     * <ul>
     * <li><strong>true</strong>: grants permissions.</li>
     * <li><strong>false</strong>: does not grant permissions.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the value to true and the SAG instance connected to the CCN instance has the secure rerouting feature enabled, you cannot revoke the permissions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GrantTrafficService")
    public Boolean grantTrafficService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-tzirqx07bvcngm****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static GrantSagInstanceToCcnRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToCcnRequest self = new GrantSagInstanceToCcnRequest();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToCcnRequest setCcnInstanceId(String ccnInstanceId) {
        this.ccnInstanceId = ccnInstanceId;
        return this;
    }
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    public GrantSagInstanceToCcnRequest setCcnUid(Long ccnUid) {
        this.ccnUid = ccnUid;
        return this;
    }
    public Long getCcnUid() {
        return this.ccnUid;
    }

    public GrantSagInstanceToCcnRequest setGrantTrafficService(Boolean grantTrafficService) {
        this.grantTrafficService = grantTrafficService;
        return this;
    }
    public Boolean getGrantTrafficService() {
        return this.grantTrafficService;
    }

    public GrantSagInstanceToCcnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantSagInstanceToCcnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantSagInstanceToCcnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantSagInstanceToCcnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantSagInstanceToCcnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GrantSagInstanceToCcnRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
