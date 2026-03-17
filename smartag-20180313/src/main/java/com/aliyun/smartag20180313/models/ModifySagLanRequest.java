// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagLanRequest extends TeaModel {
    /**
     * <p>The last IP address of the DHCP pool.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.254</p>
     */
    @NameInMap("EndIp")
    public String endIp;

    /**
     * <p>The IP address of the LAN port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>The connection type of the LAN port. Valid values:</p>
     * <ul>
     * <li><strong>DHCP</strong>: a dynamic IP address. Uses the Dynamic Host Configuration Protocol (DHCP) to dynamically assign an IP address to a connected device.</li>
     * <li><strong>STATIC</strong>: a static IP address. Specifies a static IP address for the LAN port.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <p>The time duration that the IP address is retained after it is assigned through DHCP. Unit: minute.</p>
     * <p>Valid values: <strong>1 to 43200</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Lease")
    public String lease;

    /**
     * <p>The subnet mask of the LAN port IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.0</p>
     */
    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the LAN port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PortName")
    public String portName;

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
     * <p>sag-whfn****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The serial number of the SAG device that is associated with the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    /**
     * <p>The first IP address of the DHCP pool.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.2</p>
     */
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
