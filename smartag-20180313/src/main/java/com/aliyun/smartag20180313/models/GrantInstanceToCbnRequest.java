// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantInstanceToCbnRequest extends TeaModel {
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
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jm*****</p>
     */
    @NameInMap("CenInstanceId")
    public String cenInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("CenUid")
    public Long cenUid;

    /**
     * <p>Specifies whether to grant the CEN instance permissions to manage network traffic from the CCN instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: grants permissions.</li>
     * <li><strong>false</strong>: does not grant permissions. This is the default value.</li>
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
     * <p>The ID of the region where the CCN instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.htmll">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static GrantInstanceToCbnRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCbnRequest self = new GrantInstanceToCbnRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCbnRequest setCcnInstanceId(String ccnInstanceId) {
        this.ccnInstanceId = ccnInstanceId;
        return this;
    }
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    public GrantInstanceToCbnRequest setCenInstanceId(String cenInstanceId) {
        this.cenInstanceId = cenInstanceId;
        return this;
    }
    public String getCenInstanceId() {
        return this.cenInstanceId;
    }

    public GrantInstanceToCbnRequest setCenUid(Long cenUid) {
        this.cenUid = cenUid;
        return this;
    }
    public Long getCenUid() {
        return this.cenUid;
    }

    public GrantInstanceToCbnRequest setGrantTrafficService(Boolean grantTrafficService) {
        this.grantTrafficService = grantTrafficService;
        return this;
    }
    public Boolean getGrantTrafficService() {
        return this.grantTrafficService;
    }

    public GrantInstanceToCbnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantInstanceToCbnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantInstanceToCbnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantInstanceToCbnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantInstanceToCbnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
