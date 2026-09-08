// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingEncryptionAlgorithmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncryptionAlgorithm")
    public String encryptionAlgorithm;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    public static UpdateDataMaskingEncryptionAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataMaskingEncryptionAlgorithmRequest self = new UpdateDataMaskingEncryptionAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateDataMaskingEncryptionAlgorithmRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
