// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>139a0******-cn-east-hangzhou-01</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The CA certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>mycacert01</p>
     */
    @NameInMap("CACertificateName")
    public String CACertificateName;

    /**
     * <p>The domain name on the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>.example.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The time when the CA certificate was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-08-31T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp when the CA certificate was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1504147745000</p>
     */
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    /**
     * <p>The time when the CA certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-21T06:04:25Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The timestamp when the server certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1732169065000</p>
     */
    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    /**
     * <p>The fingerprint of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>02:DF:AB:ED</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rt******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UploadCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateResponseBody self = new UploadCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCACertificateResponseBody setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public UploadCACertificateResponseBody setCACertificateName(String CACertificateName) {
        this.CACertificateName = CACertificateName;
        return this;
    }
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    public UploadCACertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public UploadCACertificateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UploadCACertificateResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public UploadCACertificateResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UploadCACertificateResponseBody setExpireTimeStamp(Long expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }
    public Long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public UploadCACertificateResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public UploadCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadCACertificateResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
