// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRoleRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PortName")
    public String portName;

    /**
     * <p>The ID of the region where the Smart Access Gateway (SAG) instance is deployed.</p>
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
     * <p>The role of the port. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: No role is assigned to the port.</li>
     * <li><strong>WAN</strong>: The port is used as a WAN port. By default, port 5 of an SAG device is used as a WAN port and supports access to the Internet by using a Dynamic Host Configuration Protocol (DHCP) client, PPPoE, or a static IP address.</li>
     * <li><strong>LAN</strong>: The port is used as a LAN port. The LAN port allows a DHCP server or a static IP address to connect to an on-premises terminal or switch.</li>
     * <li><strong>ECC</strong>: The port is used as a port to connect to an Express Connect circuit.</li>
     * <li><strong>MGT</strong>: The port is used as the management port. By default, port 2 of an SAG device is used as the management port.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>In exclusive mode, the management traffic is separated from the workload traffic. The management port is only used to access the SAG web console and cannot be used to transfer your workload data. You can access the SAG web console only through the management port.</li>
     * <li>A WAN port can be used when it is connected. If a port is the first one that obtains an IP address over DHCP and can access the Internet, it is set as a WAN port. In the SAG web console, you can set another port as a WAN port.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Role")
    public String role;

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
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagPortRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRoleRequest self = new ModifySagPortRoleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRoleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagPortRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagPortRoleRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public ModifySagPortRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagPortRoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagPortRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagPortRoleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ModifySagPortRoleRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagPortRoleRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
