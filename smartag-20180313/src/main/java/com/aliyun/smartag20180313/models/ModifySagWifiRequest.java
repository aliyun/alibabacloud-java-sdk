// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWifiRequest extends TeaModel {
    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong></li>
     * <li><strong>WPA-PSK</strong></li>
     * <li><strong>WPA2-PSK</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WPA2-PSK</p>
     */
    @NameInMap("AuthenticationType")
    public String authenticationType;

    /**
     * <p>The bandwidth of the channel. Valid values:</p>
     * <ul>
     * <li><strong>Automatic</strong></li>
     * <li><strong>20 MHz</strong></li>
     * <li><strong>40 MHz</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20 MHz</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The Wi-Fi channel.</p>
     * <p>Valid values: <strong>0 to 11</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li><strong>AUTO</strong>: automatically selects the encryption algorithm.</li>
     * <li><strong>TKIP</strong>: uses the Temporal Key Integrity Protocol (TKIP).</li>
     * <li><strong>AES</strong>: uses the Advanced Encryption Standard authorized by Wi-Fi®.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether wireless security is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables wireless security.</li>
     * <li><strong>False</strong>: disables wireless security.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsAuth")
    public String isAuth;

    /**
     * <p>Specifies whether broadcast over Wi-Fi is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables broadcast.</li>
     * <li><strong>False</strong>: disables broadcast.</li>
     * </ul>
     * <blockquote>
     * <p> Only after you enable broadcast, terminals that support wireless connections can search the Wi-Fi network by its SSID and receive Wi-Fi signals.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsBroadcast")
    public String isBroadcast;

    /**
     * <p>Specifies whether Wi-Fi is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables Wi-Fi.</li>
     * <li><strong>False</strong>: disables Wi-Fi.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsEnable")
    public String isEnable;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password used to connect to the Wi-Fi network.</p>
     * <p>The password must be 8 to 32 characters in length, and can contain digits and letters.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Password")
    public String password;

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
     * <p>The service set identifier (SSID) of the Wi-Fi network.</p>
     * <p>The name must be 1 to 31 characters in length, and can contain digits and letters.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_sag_123456****</p>
     */
    @NameInMap("SSID")
    public String SSID;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-whfn****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagWifiRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWifiRequest self = new ModifySagWifiRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagWifiRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ModifySagWifiRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifySagWifiRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ModifySagWifiRequest setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public ModifySagWifiRequest setIsAuth(String isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public String getIsAuth() {
        return this.isAuth;
    }

    public ModifySagWifiRequest setIsBroadcast(String isBroadcast) {
        this.isBroadcast = isBroadcast;
        return this;
    }
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    public ModifySagWifiRequest setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public String getIsEnable() {
        return this.isEnable;
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

    public ModifySagWifiRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifySagWifiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ModifySagWifiRequest setSSID(String SSID) {
        this.SSID = SSID;
        return this;
    }
    public String getSSID() {
        return this.SSID;
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

}
