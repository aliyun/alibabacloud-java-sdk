// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The endpoint ID.</p>
     * <blockquote>
     * <ul>
     * <li>If the cluster is a PolarDB for MySQL cluster, this parameter is required.</li>
     * <li>If the cluster is a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (Compatible with Oracle) cluster, you do not need to specify this parameter. SSL encryption is enabled for all endpoints by default.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2319159.html">DescribeDBClusterSSL</a> operation to query endpoint details.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pe-******************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the endpoint. The value must be the same as the network type of the endpoint specified by <strong>DBEndpointId</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong>: public network</li>
     * <li><strong>Private</strong>: private network</li>
     * <li><strong>Inner</strong>: private network (classic network)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the cluster is a PolarDB for MySQL cluster, this parameter is required.</li>
     * <li>If the cluster is a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (Compatible with Oracle) cluster, you do not need to specify this parameter. SSL encryption is enabled for all endpoints by default.</li>
     * </ul>
     * </blockquote>
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
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable automatic SSL certificate rotation. Valid values:</p>
     * <ul>
     * <li><p><strong>Enable</strong>: enables automatic SSL certificate rotation.</p>
     * </li>
     * <li><p><strong>Disable</strong>: disables automatic SSL certificate rotation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SSLAutoRotate")
    public String SSLAutoRotate;

    /**
     * <p>The SSL status. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong>: shutdown SSL encryption.</li>
     * <li><strong>Enable</strong>: enables SSL encryption.</li>
     * <li><strong>Update</strong>: updates the CA certificate.</li>
     * </ul>
     * <blockquote>
     * <p>After you enable SSL encryption or update the CA certificate, you must download and configure the certificate. For details, see <a href="https://help.aliyun.com/document_detail/153182.html">Settings for SSL encryption</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    public static ModifyDBClusterSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLRequest self = new ModifyDBClusterSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBClusterSSLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterSSLRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public ModifyDBClusterSSLRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyDBClusterSSLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterSSLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterSSLRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public ModifyDBClusterSSLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterSSLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterSSLRequest setSSLAutoRotate(String SSLAutoRotate) {
        this.SSLAutoRotate = SSLAutoRotate;
        return this;
    }
    public String getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    public ModifyDBClusterSSLRequest setSSLEnabled(String SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

}
