// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyADInfoRequest extends TeaModel {
    /**
     * <p>The account of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>test_account</p>
     */
    @NameInMap("ADAccountName")
    public String ADAccountName;

    /**
     * <p>The DNS information about the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ADDNS")
    public String ADDNS;

    /**
     * <p>The password for the account of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>test_password</p>
     */
    @NameInMap("ADPassword")
    public String ADPassword;

    /**
     * <p>The IP address of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("ADServerIpAddress")
    public String ADServerIpAddress;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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

    public static ModifyADInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyADInfoRequest self = new ModifyADInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyADInfoRequest setADAccountName(String ADAccountName) {
        this.ADAccountName = ADAccountName;
        return this;
    }
    public String getADAccountName() {
        return this.ADAccountName;
    }

    public ModifyADInfoRequest setADDNS(String ADDNS) {
        this.ADDNS = ADDNS;
        return this;
    }
    public String getADDNS() {
        return this.ADDNS;
    }

    public ModifyADInfoRequest setADPassword(String ADPassword) {
        this.ADPassword = ADPassword;
        return this;
    }
    public String getADPassword() {
        return this.ADPassword;
    }

    public ModifyADInfoRequest setADServerIpAddress(String ADServerIpAddress) {
        this.ADServerIpAddress = ADServerIpAddress;
        return this;
    }
    public String getADServerIpAddress() {
        return this.ADServerIpAddress;
    }

    public ModifyADInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyADInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyADInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyADInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyADInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyADInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
