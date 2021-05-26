// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateResponseBody extends TeaModel {
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    @NameInMap("CACertificateId")
    public String CACertificateId;

    public static UploadCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateResponseBody self = new UploadCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCACertificateResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public UploadCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadCACertificateResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UploadCACertificateResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public UploadCACertificateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UploadCACertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public UploadCACertificateResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UploadCACertificateResponseBody setCACertificateName(String CACertificateName) {
        this.CACertificateName = CACertificateName;
        return this;
    }
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    public UploadCACertificateResponseBody setExpireTimeStamp(Long expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }
    public Long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public UploadCACertificateResponseBody setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

}
