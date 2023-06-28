// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateResponseBody extends TeaModel {
    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("IsAliCloudCertificate")
    public Integer isAliCloudCertificate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    @NameInMap("SubjectAlternativeNames")
    public UploadServerCertificateResponseBodySubjectAlternativeNames subjectAlternativeNames;

    public static UploadServerCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadServerCertificateResponseBody self = new UploadServerCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadServerCertificateResponseBody setAliCloudCertificateId(String aliCloudCertificateId) {
        this.aliCloudCertificateId = aliCloudCertificateId;
        return this;
    }
    public String getAliCloudCertificateId() {
        return this.aliCloudCertificateId;
    }

    public UploadServerCertificateResponseBody setAliCloudCertificateName(String aliCloudCertificateName) {
        this.aliCloudCertificateName = aliCloudCertificateName;
        return this;
    }
    public String getAliCloudCertificateName() {
        return this.aliCloudCertificateName;
    }

    public UploadServerCertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public UploadServerCertificateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UploadServerCertificateResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public UploadServerCertificateResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UploadServerCertificateResponseBody setExpireTimeStamp(Long expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }
    public Long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public UploadServerCertificateResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public UploadServerCertificateResponseBody setIsAliCloudCertificate(Integer isAliCloudCertificate) {
        this.isAliCloudCertificate = isAliCloudCertificate;
        return this;
    }
    public Integer getIsAliCloudCertificate() {
        return this.isAliCloudCertificate;
    }

    public UploadServerCertificateResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadServerCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadServerCertificateResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UploadServerCertificateResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public UploadServerCertificateResponseBody setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public UploadServerCertificateResponseBody setSubjectAlternativeNames(UploadServerCertificateResponseBodySubjectAlternativeNames subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public UploadServerCertificateResponseBodySubjectAlternativeNames getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public static class UploadServerCertificateResponseBodySubjectAlternativeNames extends TeaModel {
        @NameInMap("SubjectAlternativeName")
        public java.util.List<String> subjectAlternativeName;

        public static UploadServerCertificateResponseBodySubjectAlternativeNames build(java.util.Map<String, ?> map) throws Exception {
            UploadServerCertificateResponseBodySubjectAlternativeNames self = new UploadServerCertificateResponseBodySubjectAlternativeNames();
            return TeaModel.build(map, self);
        }

        public UploadServerCertificateResponseBodySubjectAlternativeNames setSubjectAlternativeName(java.util.List<String> subjectAlternativeName) {
            this.subjectAlternativeName = subjectAlternativeName;
            return this;
        }
        public java.util.List<String> getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

    }

}
