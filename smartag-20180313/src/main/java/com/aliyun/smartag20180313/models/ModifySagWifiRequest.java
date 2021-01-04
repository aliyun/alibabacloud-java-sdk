// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWifiRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    @NameInMap("IsEnable")
    public String isEnable;

    @NameInMap("SSID")
    public String SSID;

    @NameInMap("IsBroadcast")
    public String isBroadcast;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("IsAuth")
    public String isAuth;

    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    @NameInMap("Password")
    public String password;

    public static ModifySagWifiRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWifiRequest self = new ModifySagWifiRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagWifiRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagWifiRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagWifiRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagWifiRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagWifiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagWifiRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagWifiRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public ModifySagWifiRequest setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public String getIsEnable() {
        return this.isEnable;
    }

    public ModifySagWifiRequest setSSID(String SSID) {
        this.SSID = SSID;
        return this;
    }
    public String getSSID() {
        return this.SSID;
    }

    public ModifySagWifiRequest setIsBroadcast(String isBroadcast) {
        this.isBroadcast = isBroadcast;
        return this;
    }
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    public ModifySagWifiRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ModifySagWifiRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifySagWifiRequest setIsAuth(String isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public String getIsAuth() {
        return this.isAuth;
    }

    public ModifySagWifiRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ModifySagWifiRequest setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public ModifySagWifiRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
