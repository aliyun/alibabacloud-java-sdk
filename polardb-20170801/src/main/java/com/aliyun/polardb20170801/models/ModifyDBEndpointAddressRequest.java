// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressRequest extends TeaModel {
    /**
     * <p>The prefix of the new endpoint. The prefix must meet the following requirements:</p>
     * <br>
     * <p>*   It can contain lowercase letters, digits, and hyphens (-).</p>
     * <p>*   It must start with a letter and end with a digit or a letter.</p>
     * <p>*   It must be 6 to 30 characters in length.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusterEndpoints](~~98205~~) operation to query endpoint IDs.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Public**</p>
     * <p>*   **Private**</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port number. Valid values: 3000 to 5999.</p>
     * <br>
     * <p>> This parameter is valid only for PolarDB for MySQL clusters. If you leave this parameter empty, the default port 3306 is used.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The prefix of the private domain name. The prefix must meet the following requirements:</p>
     * <br>
     * <p>*   The prefix can contain lowercase letters, digits, and hyphens (-).</p>
     * <p>*   The prefix must start with a letter and end with a digit or a letter.</p>
     * <p>*   The prefix must be 6 to 30 characters in length.</p>
     * <br>
     * <p>>- You can bind each internal endpoint of PolarDB to a private domain name. The private domain name takes effect only in the specified virtual private clouds (VPCs) in the current region. Private domain names are managed by using PrivateZone. You can use the CNAME record of PrivateZone to map domain names to PolarDB. You are charged a small fee for this feature. For more information, see [Pricing](~~71338~~).</p>
     * <p>>- This parameter takes effect only if you set **NetType** to Private.</p>
     */
    @NameInMap("PrivateZoneAddressPrefix")
    public String privateZoneAddressPrefix;

    /**
     * <p>The name of the private zone.</p>
     * <br>
     * <p>> This parameter takes effect only when **NetType** is set to Private.</p>
     */
    @NameInMap("PrivateZoneName")
    public String privateZoneName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBEndpointAddressRequest self = new ModifyDBEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBEndpointAddressRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyDBEndpointAddressRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBEndpointAddressRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public ModifyDBEndpointAddressRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyDBEndpointAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBEndpointAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBEndpointAddressRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyDBEndpointAddressRequest setPrivateZoneAddressPrefix(String privateZoneAddressPrefix) {
        this.privateZoneAddressPrefix = privateZoneAddressPrefix;
        return this;
    }
    public String getPrivateZoneAddressPrefix() {
        return this.privateZoneAddressPrefix;
    }

    public ModifyDBEndpointAddressRequest setPrivateZoneName(String privateZoneName) {
        this.privateZoneName = privateZoneName;
        return this;
    }
    public String getPrivateZoneName() {
        return this.privateZoneName;
    }

    public ModifyDBEndpointAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
