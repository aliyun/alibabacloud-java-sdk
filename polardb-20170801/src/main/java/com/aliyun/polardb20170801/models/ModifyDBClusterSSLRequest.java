// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required for a PolarDB for MySQL cluster.</p>
     * <br>
     * <p>*   This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.</p>
     * <p>*   You can call the [DescribeDBClusterSSL](https://help.aliyun.com/document_detail/153414.html) operation to view the details of the endpoint.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type supported by the endpoint that is specified by **DBEndpointId**. Valid values:</p>
     * <br>
     * <p>*   **Public**</p>
     * <p>*   **Private**</p>
     * <p>*   **Inner**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required for a PolarDB for MySQL cluster.</p>
     * <br>
     * <p>*   This parameter is not required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. By default, SSL encryption is enabled for all endpoints.</p>
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
     * <br>
     * <p>*   **Enable**: The feature is enabled.</p>
     * <p>*   **Disable**: The feature is disabled.</p>
     */
    @NameInMap("SSLAutoRotate")
    public String SSLAutoRotate;

    /**
     * <p>The SSL encryption status. Valid values:</p>
     * <br>
     * <p>*   **Disable**: SSL encryption is disabled.</p>
     * <p>*   **Enable**: SSL encryption is enabled.</p>
     * <p>*   **Update**: The SSL certificate is updated.</p>
     * <br>
     * <p>> After you enable SSL encryption or update the SSL certificate, you must download and configure the certificate. For more information, see [Configure SSL encryption](https://help.aliyun.com/document_detail/153182.html).</p>
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
