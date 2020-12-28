// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    @NameInMap("CACertificateId")
    public String CACertificateId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    @NameInMap("CommonName")
    public String commonName;

    public static UploadCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateResponseBody self = new UploadCACertificateResponseBody();
        return TeaModel.build(map, self);
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

    public UploadCACertificateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UploadCACertificateResponseBody setCACertificateName(String CACertificateName) {
        this.CACertificateName = CACertificateName;
        return this;
    }
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    public UploadCACertificateResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UploadCACertificateResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public UploadCACertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

}
