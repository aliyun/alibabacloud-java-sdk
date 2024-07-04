// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateSM2CertRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-sm2</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     * <hr>
     * <p>-----END CERTIFICATE-----</p>
     */
    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     * <hr>
     * <p>-----END PRIVATE KEY-----</p>
     */
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    /**
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     * <hr>
     * <p>-----END CERTIFICATE-----</p>
     */
    @NameInMap("SignCertificate")
    public String signCertificate;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     * <hr>
     * <p>-----END PRIVATE KEY-----</p>
     */
    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    public static CreateSM2CertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSM2CertRequest self = new CreateSM2CertRequest();
        return TeaModel.build(map, self);
    }

    public CreateSM2CertRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateSM2CertRequest setEncryptCertificate(String encryptCertificate) {
        this.encryptCertificate = encryptCertificate;
        return this;
    }
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    public CreateSM2CertRequest setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public CreateSM2CertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSM2CertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSM2CertRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateSM2CertRequest setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }
    public String getSignCertificate() {
        return this.signCertificate;
    }

    public CreateSM2CertRequest setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

}
