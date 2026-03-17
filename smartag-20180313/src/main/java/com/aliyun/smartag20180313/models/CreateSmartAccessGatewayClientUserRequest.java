// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayClientUserRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth value. Unit: Kbit/s. Valid values: <strong>1 to 20000</strong>. Default value: <strong>2000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <ul>
     * <li>If you enable the client app service, you must set the IP address of the client app. The current client account uses the specified IP address to connect to Alibaba Cloud.</li>
     * </ul>
     * <blockquote>
     * <p> The IP address must fall within a private CIDR block.</p>
     * </blockquote>
     * <ul>
     * <li>If you disable the client app service, an IP address within a private CIDR block is assigned to the client account. Each connection to Alibaba Cloud uses a different IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password that is used to log on to the SAG app.</p>
     * <p>The password must be 8 to 32 characters in length. It can contain letters, digits, underscores (_), at signs (@), and hyphens (-). It must start with a letter or a digit.</p>
     * 
     * <strong>example:</strong>
     * <p>duuf****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the Smart Access Gateway (SAG) app instance.</p>
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
     * <p>sag-gnhe6sywtare5****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The email address of the client account. The username and password are sent to the specified email address by the administrator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("UserMail")
    public String userMail;

    /**
     * <p>The username of the client account. The usernames of client accounts added to the same SAG app instance must be unique.</p>
     * <p>The username must be 7 to 33 characters in length, and can contain letters, digits, underscores (_), at signs (@), periods (.), and hyphens (-). It must start with a letter or a digit.</p>
     * <blockquote>
     * <p> For a client account, if you specify the username, you must also specify the password. If you specify the password, you must specify the username.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateSmartAccessGatewayClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayClientUserRequest self = new CreateSmartAccessGatewayClientUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayClientUserRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateSmartAccessGatewayClientUserRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateSmartAccessGatewayClientUserRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSmartAccessGatewayClientUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmartAccessGatewayClientUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateSmartAccessGatewayClientUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSmartAccessGatewayClientUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmartAccessGatewayClientUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmartAccessGatewayClientUserRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public CreateSmartAccessGatewayClientUserRequest setUserMail(String userMail) {
        this.userMail = userMail;
        return this;
    }
    public String getUserMail() {
        return this.userMail;
    }

    public CreateSmartAccessGatewayClientUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
