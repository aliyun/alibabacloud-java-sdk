// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateResponseBody extends TeaModel {
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The ID of the CA certificate.</p>
     */
    @NameInMap("CACertificateName")
    public String CACertificateName;

    /**
     * <p>The name of the CA certificate.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The ID of the enterprise resource group.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the CA certificate expires.</p>
     */
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    /**
     * <p>The time when the CA certificate is uploaded.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.</p>
     */
    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    /**
     * <p>The domain name of the CA certificate.</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The fingerprint of the CA certificate.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp generated when the CA certificate expires.</p>
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
