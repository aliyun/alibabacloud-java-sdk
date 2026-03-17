// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWanRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the WAN port. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The IP address of the gateway.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the WAN port uses a static IP address, you must set this parameter.</li>
     * <li>After this parameter is set, the SAG device generates a default route.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.254</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The IP address of the WAN port.</p>
     * <blockquote>
     * <p> If the WAN port uses a static IP address, you must set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>The connection type of the WAN port: Valid values:</p>
     * <ul>
     * <li><strong>DHCP</strong>: The WAN port connects to the Internet through an IP address that is dynamically assigned by the Dynamic Host Configuration Protocol (DHCP) server.</li>
     * <li><strong>STATIC</strong>: The WAN port connects to the Internet through a static IP address. If you set this value, you must configure a static IP address, a subnet mask, and a gateway IP address for the WAN port.</li>
     * <li><strong>PPPOE</strong>: The WAN port connects to the Internet through dial-up connections. If you set this value, you must enter the username and password of the PPPoE account provided by the Internet service provider (ISP).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DHCP</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <p>The ISP used by the WAN port. Valid values:</p>
     * <ul>
     * <li><strong>CT</strong>: China Telecom</li>
     * <li><strong>CM</strong>: China Mobile</li>
     * <li><strong>CU</strong>: China Unicom</li>
     * <li><strong>Other</strong>: Other ISPs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CT</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The subnet mask of the WAN port IP address.</p>
     * <blockquote>
     * <p> If the WAN port uses a static IP address, you must set this parameter.</p>
     * </blockquote>
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
     * <p>The password of the PPPoE account.</p>
     * <p>The username must be 6 to 30 characters in length, and can contain digits and letters.</p>
     * <blockquote>
     * <p> If the connection type of the WAN port is PPPoE, you must set this parameter. If you do not need to modify the password, you can ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>P12ppq***</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The number of the WAN port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PortName")
    public String portName;

    /**
     * <p>The priority of the WAN port.</p>
     * <p>Valid values: <strong>-1</strong> and <strong>1 to 50</strong>.</p>
     * <p>A smaller value indicates a higher priority. A value of <strong>-1</strong> indicates that traffic forwarding is disabled on the WAN port.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    /**
     * <p>The username of the PPPoE account.</p>
     * <p>The username must be 6 to 30 characters in length, and can contain digits and letters.</p>
     * <blockquote>
     * <p> If the connection type of the WAN port is PPPoE, you must set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>P12ppp***</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The weight of the WAN port.</p>
     * <p>Valid values: <strong>1 to 100</strong>. Default value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static ModifySagWanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWanRequest self = new ModifySagWanRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagWanRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifySagWanRequest setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public ModifySagWanRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ModifySagWanRequest setIPType(String IPType) {
        this.IPType = IPType;
        return this;
    }
    public String getIPType() {
        return this.IPType;
    }

    public ModifySagWanRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public ModifySagWanRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ModifySagWanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagWanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagWanRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifySagWanRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public ModifySagWanRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifySagWanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagWanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagWanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagWanRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagWanRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public ModifySagWanRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ModifySagWanRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
