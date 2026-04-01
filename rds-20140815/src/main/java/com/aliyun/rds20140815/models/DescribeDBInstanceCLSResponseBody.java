// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceCLSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:123456789:key/xxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <strong>example:</strong>
     * <p>KMS</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <strong>example:</strong>
     * <p>D0073A98-52F1-3075-8256-3943F*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WhiteListMode")
    public Boolean whiteListMode;

    public static DescribeDBInstanceCLSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceCLSResponseBody self = new DescribeDBInstanceCLSResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceCLSResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DescribeDBInstanceCLSResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBInstanceCLSResponseBody setEncryptionKeyMode(String encryptionKeyMode) {
        this.encryptionKeyMode = encryptionKeyMode;
        return this;
    }
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    public DescribeDBInstanceCLSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceCLSResponseBody setWhiteListMode(Boolean whiteListMode) {
        this.whiteListMode = whiteListMode;
        return this;
    }
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

}
