// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagLanRequest extends TeaModel {
    @NameInMap("EndIp")
    public String endIp;

    @NameInMap("IP")
    public String IP;

    @NameInMap("IPType")
    public String IPType;

    @NameInMap("Lease")
    public String lease;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    @NameInMap("StartIp")
    public String startIp;

    public static ModifySagLanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagLanRequest self = new ModifySagLanRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagLanRequest setEndIp(String endIp) {
        this.endIp = endIp;
        return this;
    }
    public String getEndIp() {
        return this.endIp;
    }

    public ModifySagLanRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ModifySagLanRequest setIPType(String IPType) {
        this.IPType = IPType;
        return this;
    }
    public String getIPType() {
        return this.IPType;
    }

    public ModifySagLanRequest setLease(String lease) {
        this.lease = lease;
        return this;
    }
    public String getLease() {
        return this.lease;
    }

    public ModifySagLanRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ModifySagLanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagLanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagLanRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public ModifySagLanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagLanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagLanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagLanRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagLanRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public ModifySagLanRequest setStartIp(String startIp) {
        this.startIp = startIp;
        return this;
    }
    public String getStartIp() {
        return this.startIp;
    }

}
