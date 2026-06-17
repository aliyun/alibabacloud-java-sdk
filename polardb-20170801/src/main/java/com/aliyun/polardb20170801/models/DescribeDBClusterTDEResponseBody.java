// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterTDEResponseBody extends TeaModel {
    /**
     * <p>Indicates whether automatic key rotation is allowed. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Automatic key rotation is allowed.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Automatic key rotation is not allowed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the database engine is compatible with PostgreSQL or Oracle syntax.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The unique ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Indicates whether automatic encryption is enabled for all newly created tables. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: Automatic encryption is enabled.</p>
     * </li>
     * <li><p><strong>OFF</strong>: Automatic encryption is disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the database engine is compatible with MySQL.</p>
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

    /**
     * <p>The status of the key. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: The key is enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The key is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E37D1508-EC3B-4E06-A24A-C7AC31******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The automatic key rotation interval configured in KMS. If no automatic key rotation interval is set, 0 s is returned. Unit: s.</p>
     * <p>For example, if the rotation interval is 7 days, 604800 s is returned.</p>
     * <blockquote>
     * <p>This parameter is returned only when the database engine is compatible with PostgreSQL or Oracle syntax, and the value of <code>AutomaticRotation</code> is <code>Enabled</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>604800s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The region where the TDE key is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TDERegion")
    public String TDERegion;

    /**
     * <p>Indicates whether TDE encryption is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: TDE encryption is enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: TDE encryption is disabled.</p>
     * </li>
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
