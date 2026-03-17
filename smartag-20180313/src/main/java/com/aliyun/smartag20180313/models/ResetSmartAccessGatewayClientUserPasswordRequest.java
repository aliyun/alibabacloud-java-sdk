// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ResetSmartAccessGatewayClientUserPasswordRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new password.</p>
     * <ul>
     * <li><p>If you do not specify a new password, the system generates a random password.</p>
     * </li>
     * <li><p>If you specify a new password, the password is reset to the specified new password.</p>
     * <p>The password must be 8 to 32 characters in length, and can contain letters, digits, underscores (_), at signs (@), periods (.), and hyphens (-). It must start with a letter or a digit.</p>
     * </li>
     * </ul>
     * <p>After the password is reset, an email that contains the new password is sent to the email address of the client account.</p>
     * 
     * <strong>example:</strong>
     * <p>Password****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region where the SAG app instance is deployed.</p>
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
     * <p>The ID of the SAG app instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-kzo5dvms3dqii3****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The username of the client account for which you want to reset the password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ResetSmartAccessGatewayClientUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSmartAccessGatewayClientUserPasswordRequest self = new ResetSmartAccessGatewayClientUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ResetSmartAccessGatewayClientUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
