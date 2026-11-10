// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingEncryptionAlgorithmRequest extends TeaModel {
    /**
     * <p>The name of the instance-level column encryption algorithm. Select an available algorithm from ListDataMaskingEncryptionAlgorithms.</p>
     * 
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncryptionAlgorithm")
    public String encryptionAlgorithm;

    /**
     * <p>The identifier of the Key Management Service (KMS) key. You can obtain it from Items[].KeyId in the response of ListKmsKeys. Provide this parameter when using a KMS key. Do not pass this parameter in local key scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The database instance identity. You can obtain it from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The code of the cloud service. Column encryption supports ApsaraDB RDS, PolarDB, and PolarDB-X 2.0. If ProductId is also provided, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The identifier of the cloud service type. Valid values:</p>
     * <ul>
     * <li>5: ApsaraDB RDS.</li>
     * <li>8: PolarDB.</li>
     * <li>27: PolarDB-X 2.0.
     * If specified together with ProductCode, the values must match.</li>
     * </ul>
     * 
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
