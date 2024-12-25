// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateResponseBody extends TeaModel {
    /**
     * <p>The AliCloud certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>775****</p>
     */
    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    /**
     * <p>The AliCloud certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudcertificate****</p>
     */
    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    /**
     * <p>The domain name of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The time when the CA certificate is uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-21T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp generated when the CA certificate is uploaded.</p>
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
     * <p>2022-10-18T23:59:59Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The timestamp generated when the CA certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1504147745000</p>
     */
    @NameInMap("ExpireTimeStamp")
    public Long expireTimeStamp;

    /**
     * <p>The fingerprint of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>8f:7d:cb:e5:f8:c8:33:9c:17:65:c1:92:30:9e:45:55:9c:3a:85:60</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>Indicates whether the certificate is provided by Alibaba Cloud Certificate Management Service. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The certificate is not provided by Alibaba Cloud Certificate Management Service.</li>
     * <li><strong>1</strong>: The certificate is provided by Alibaba Cloud Certificate Management Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsAliCloudCertificate")
    public Integer isAliCloudCertificate;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rt****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1321932713******<em>17f1b4b696b_1114720822</em>-1671******</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>The name of the server certificate.</p>
     * <p>The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>mycert01</p>
     */
    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    /**
     * <p>The subject alternative names.</p>
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
