// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateResponseBody extends TeaModel {
    /**
     * <p>The AliCloud certificate ID.</p>
     */
    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    /**
     * <p>The AliCloud certificate name.</p>
     */
    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    /**
     * <p>The domain name of the CA certificate.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The time when the CA certificate is uploaded.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp generated when the CA certificate is uploaded.</p>
     */
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    /**
     * <p>The time when the CA certificate expires.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The timestamp generated when the CA certificate expires.</p>
     */
    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    /**
     * <p>The fingerprint of the CA certificate.</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>Indicates whether the certificate is provided by Alibaba Cloud Certificate Management Service. Valid values:</p>
     * <p>- **0**: The certificate is not provided by Alibaba Cloud Certificate Management Service.</p>
     * <p>- **1**: The certificate is provided by Alibaba Cloud Certificate Management Service.</p>
     */
    @NameInMap("IsAliCloudCertificate")
    public Integer isAliCloudCertificate;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the server certificate.</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>The name of the server certificate.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    /**
     * <p>The subject alternative names.</p>
     * <br>
     * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
     */
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
