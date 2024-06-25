// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressRequest extends TeaModel {
    /**
     * <p>The prefix of the new endpoint. The prefix must meet the following requirements:</p>
     * <ul>
     * <li>It can contain lowercase letters, digits, and hyphens (-).</li>
     * <li>It must start with a letter and end with a digit or a letter.</li>
     * <li>It must be 6 to 30 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query endpoint IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pe-****************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>Private</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port number. Valid values: 3000 to 5999.</p>
     * <blockquote>
     * <p>This parameter is valid only for PolarDB for MySQL clusters. If you leave this parameter empty, the default port 3306 is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The prefix of the private domain name. The prefix must meet the following requirements:</p>
     * <ul>
     * <li>The prefix can contain lowercase letters, digits, and hyphens (-).</li>
     * <li>The prefix must start with a letter and end with a digit or a letter.</li>
     * <li>The prefix must be 6 to 30 characters in length.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can bind each internal endpoint of PolarDB to a private domain name. The private domain name takes effect only in the specified virtual private clouds (VPCs) in the current region. Private domain names are managed by using PrivateZone. You can use the CNAME record of PrivateZone to map domain names to PolarDB. You are charged a small fee for this feature. For more information, see <a href="https://help.aliyun.com/document_detail/71338.html">Pricing</a>.</li>
     * <li>This parameter takes effect only if you set <strong>NetType</strong> to Private.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc</p>
     */
    @NameInMap("PrivateZoneAddressPrefix")
    public String privateZoneAddressPrefix;

    /**
     * <p>The name of the private zone.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>NetType</strong> is set to Private.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
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
