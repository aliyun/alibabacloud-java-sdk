// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required for a PolarDB for MySQL cluster.</p>
     * </li>
     * <li><p>This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/153414.html">DescribeDBClusterSSL</a> operation to view the details of the endpoint.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pe-******************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type supported by the endpoint that is specified by <strong>DBEndpointId</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>Private</strong></li>
     * <li><strong>Inner</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required for a PolarDB for MySQL cluster.</p>
     * </li>
     * <li><p>This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.</p>
     * </li>
     * </ul>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether automatic rotation of SSL certificates is enabled.</p>
     * <ul>
     * <li><strong>Enable</strong>: The feature is enabled.</li>
     * <li><strong>Disable</strong>: The feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SSLAutoRotate")
    public String SSLAutoRotate;

    /**
     * <p>The SSL encryption status. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong>: SSL encryption is disabled.</li>
     * <li><strong>Enable</strong>: SSL encryption is enabled.</li>
     * <li><strong>Update</strong>: The SSL certificate is updated.</li>
     * </ul>
     * <blockquote>
     * <p>After you enable SSL encryption or update the SSL certificate, you must download and configure the certificate. For more information, see <a href="https://help.aliyun.com/document_detail/153182.html">Configure SSL encryption</a>.</p>
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
