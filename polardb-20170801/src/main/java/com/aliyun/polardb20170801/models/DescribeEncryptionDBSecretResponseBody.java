// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBSecretResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionDBRegion")
    public String encryptionDBRegion;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("EncryptionDBStatus")
    public String encryptionDBStatus;

    /**
     * <strong>example:</strong>
     * <p>2a4f4ac2-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>944CED46-A6F7-40C6-B6DC-C6E5CC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEncryptionDBSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBSecretResponseBody self = new DescribeEncryptionDBSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBSecretResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeEncryptionDBSecretResponseBody setEncryptionDBRegion(String encryptionDBRegion) {
        this.encryptionDBRegion = encryptionDBRegion;
        return this;
    }
    public String getEncryptionDBRegion() {
        return this.encryptionDBRegion;
    }

    public DescribeEncryptionDBSecretResponseBody setEncryptionDBStatus(String encryptionDBStatus) {
        this.encryptionDBStatus = encryptionDBStatus;
        return this;
    }
    public String getEncryptionDBStatus() {
        return this.encryptionDBStatus;
    }

    public DescribeEncryptionDBSecretResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeEncryptionDBSecretResponseBody setEncryptionKeyStatus(String encryptionKeyStatus) {
        this.encryptionKeyStatus = encryptionKeyStatus;
        return this;
    }
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    public DescribeEncryptionDBSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
