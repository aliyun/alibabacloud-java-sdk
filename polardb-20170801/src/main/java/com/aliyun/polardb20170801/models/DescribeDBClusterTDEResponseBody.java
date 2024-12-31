// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterTDEResponseBody extends TeaModel {
    /**
     * <p>Indicates whether automatic key rotation is allowed. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Automatic key rotation is allowed.</li>
     * <li><strong>Disabled</strong>: Automatic key rotation is not allowed.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for a PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Indicates whether automatic encryption is enabled for new tables. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("EncryptNewTables")
    public String encryptNewTables;

    /**
     * <p>The ID of the custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>2a4f4ac2-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E37D1508-EC3B-4E06-A24A-C7AC31******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The automatic key rotation period configured in Key Management Service (KMS). If no automatic key rotation period is configured, 0s is returned. Unit: seconds.</p>
     * <p>For example, if the rotation period is set to 7 days, 604800s is returned.</p>
     * <blockquote>
     * <p> This parameter is returned only for a PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle) cluster whose AutomaticRotation parameter is set to Enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>604800s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The region where the TDE key resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TDERegion")
    public String TDERegion;

    /**
     * <p>Indicates whether TDE encryption is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static DescribeDBClusterTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterTDEResponseBody self = new DescribeDBClusterTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterTDEResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    public DescribeDBClusterTDEResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterTDEResponseBody setEncryptNewTables(String encryptNewTables) {
        this.encryptNewTables = encryptNewTables;
        return this;
    }
    public String getEncryptNewTables() {
        return this.encryptNewTables;
    }

    public DescribeDBClusterTDEResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBClusterTDEResponseBody setEncryptionKeyStatus(String encryptionKeyStatus) {
        this.encryptionKeyStatus = encryptionKeyStatus;
        return this;
    }
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    public DescribeDBClusterTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterTDEResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public DescribeDBClusterTDEResponseBody setTDERegion(String TDERegion) {
        this.TDERegion = TDERegion;
        return this;
    }
    public String getTDERegion() {
        return this.TDERegion;
    }

    public DescribeDBClusterTDEResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
