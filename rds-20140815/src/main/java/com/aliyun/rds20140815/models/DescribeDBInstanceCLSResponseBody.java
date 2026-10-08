// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceCLSResponseBody extends TeaModel {
    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li>AES_128_CBC</li>
     * <li>AES_128_GCM</li>
     * <li>AES_128_CTR</li>
     * <li>AES_128_ECB</li>
     * <li>AES_256_CBC</li>
     * <li>AES_256_GCM</li>
     * <li>AES_256_CTR</li>
     * <li>AES_256_ECB</li>
     * <li>SM4_128_CBC</li>
     * <li>SM4_128_GCM</li>
     * <li>SM4_128_CTR</li>
     * <li>SM4_128_ECB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The custom KMS master key ID.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the column encryption key pattern is set to kms_key. If this parameter is not specified, the current column encryption key settings of the database remain unchanged.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The column encryption key mode. Valid values:</p>
     * <ul>
     * <li>client_key: configures a user-generated random key on the client side.</li>
     * <li>kms_key: configures a custom key by using Alibaba Cloud Key Management Service (KMS).</li>
     * </ul>
     * <blockquote>
     * <p> After an instance is configured to use KMS for key management, you can no longer switch back to the client-side random key mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kms_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0073A98-52F1-3075-8256-3943F*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the whitelist mode is enabled.</p>
     * 
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
