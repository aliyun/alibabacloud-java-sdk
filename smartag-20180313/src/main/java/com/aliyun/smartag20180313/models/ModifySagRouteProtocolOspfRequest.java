// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolOspfRequest extends TeaModel {
    /**
     * <p>The ID of the OSPF area.</p>
     * <p>Valid values: <strong>1 to 2147483647</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("AreaId")
    public Integer areaId;

    /**
     * <p>The authentication method. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: does not enable authentication.</li>
     * <li><strong>CLEARTEXT</strong>: uses plaintext authentication. You must enter the plaintext password.</li>
     * <li><strong>MD5</strong>: uses MD5 authentication. You must enter the MD5 key ID and the MD5 key.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("AuthenticationType")
    public String authenticationType;

    /**
     * <p>The timeout period of OSPF. Unit: seconds.</p>
     * <p>Valid values: <strong>1 to 65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DeadTime")
    public Integer deadTime;

    /**
     * <p>The time interval at which Hello packets are sent. Unit: seconds.</p>
     * <p>Valid values: <strong>1 to 65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HelloTime")
    public Integer helloTime;

    /**
     * <p>The MD5 key value.</p>
     * <p>Valid values: <strong>1 to 47</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Md5Key")
    public String md5Key;

    /**
     * <p>The ID of the MD5 key.</p>
     * <p>Valid values: <strong>1 to 2147483647</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The plaintext password.</p>
     * <p>The password must be 1 to 8 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <blockquote>
     * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>CLEARTEXT</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1212****</p>
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
     * <p>The ID of the router that has OSPF enabled.</p>
     * <p>Set the value to an IPv4 address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

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
     * <p>The serial number of the SAG device associated with the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30***</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagRouteProtocolOspfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolOspfRequest self = new ModifySagRouteProtocolOspfRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolOspfRequest setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }
    public Integer getAreaId() {
        return this.areaId;
    }

    public ModifySagRouteProtocolOspfRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ModifySagRouteProtocolOspfRequest setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public ModifySagRouteProtocolOspfRequest setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public ModifySagRouteProtocolOspfRequest setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public ModifySagRouteProtocolOspfRequest setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public ModifySagRouteProtocolOspfRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagRouteProtocolOspfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagRouteProtocolOspfRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifySagRouteProtocolOspfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagRouteProtocolOspfRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagRouteProtocolOspfRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagRouteProtocolOspfRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ModifySagRouteProtocolOspfRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagRouteProtocolOspfRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
