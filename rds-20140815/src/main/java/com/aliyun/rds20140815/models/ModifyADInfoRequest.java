// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyADInfoRequest extends TeaModel {
    @NameInMap("ADAccountName")
    public String ADAccountName;

    @NameInMap("ADDNS")
    public String ADDNS;

    @NameInMap("ADPassword")
    public String ADPassword;

    @NameInMap("ADServerIpAddress")
    public String ADServerIpAddress;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

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
