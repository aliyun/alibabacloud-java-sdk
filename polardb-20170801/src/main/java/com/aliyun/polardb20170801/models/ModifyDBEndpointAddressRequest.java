// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressRequest extends TeaModel {
    /**
     * <p>The new connection string prefix. The prefix must meet the following requirements:</p>
     * <ul>
     * <li><p>It can contain only lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>It must start with a letter and end with a letter or a digit.</p>
     * </li>
     * <li><p>It must be 6 to 30 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in your account, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the connection address.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the ID of a connection address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pe-****************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the connection address. Valid values:</p>
     * <ul>
     * <li><p><strong>Public</strong>: public network</p>
     * </li>
     * <li><p><strong>Private</strong>: private network</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>Inner</strong>: classic network</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Only PolarDB for MySQL clusters support the classic network type.</p>
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
     * <p>The port number. The valid range is 3000 to 5999.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only for PolarDB for MySQL clusters. If you do not specify this parameter, the port defaults to 3306.</li>
     * </ul>
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
     * <li><p>It can contain only lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>It must start with a letter and end with a letter or a digit.</p>
     * </li>
     * <li><p>It must be 6 to 30 characters in length.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can bind a private domain name to each private endpoint of a PolarDB cluster. This domain name is effective only in the specified VPC within the current region. The private domain name is managed by PrivateZone and is mapped to the built-in private endpoint of the cluster through a CNAME record. This feature incurs a small fee. For more information, see <a href="https://help.aliyun.com/document_detail/71338.html">Pricing</a>.</p>
     * </li>
     * <li><p>This parameter is valid only when <strong>NetType is set to Private</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc</p>
     */
    @NameInMap("PrivateZoneAddressPrefix")
    public String privateZoneAddressPrefix;

    /**
     * <p>The private zone name.</p>
     * <blockquote>
     * <p>This parameter is valid only when <strong>NetType is set to Private</strong>.</p>
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
