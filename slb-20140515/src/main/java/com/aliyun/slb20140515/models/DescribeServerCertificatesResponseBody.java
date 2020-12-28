// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerCertificates")
    public java.util.List<DescribeServerCertificatesResponseBodyServerCertificates> serverCertificates;

    public static DescribeServerCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerCertificatesResponseBody self = new DescribeServerCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerCertificatesResponseBody setServerCertificates(java.util.List<DescribeServerCertificatesResponseBodyServerCertificates> serverCertificates) {
        this.serverCertificates = serverCertificates;
        return this;
    }
    public java.util.List<DescribeServerCertificatesResponseBodyServerCertificates> getServerCertificates() {
        return this.serverCertificates;
    }

    public static class DescribeServerCertificatesResponseBodyServerCertificates extends TeaModel {
        @NameInMap("AliCloudCertificateName")
        public String aliCloudCertificateName;

        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServerCertificateName")
        public String serverCertificateName;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("SubjectAlternativeNames")
        public java.util.List<String> subjectAlternativeNames;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("IsAliCloudCertificate")
        public Integer isAliCloudCertificate;

        @NameInMap("AliCloudCertificateId")
        public String aliCloudCertificateId;

        public static DescribeServerCertificatesResponseBodyServerCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificates self = new DescribeServerCertificatesResponseBodyServerCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setAliCloudCertificateName(String aliCloudCertificateName) {
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }
        public String getAliCloudCertificateName() {
            return this.aliCloudCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public java.util.List<String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setIsAliCloudCertificate(Integer isAliCloudCertificate) {
            this.isAliCloudCertificate = isAliCloudCertificate;
            return this;
        }
        public Integer getIsAliCloudCertificate() {
            return this.isAliCloudCertificate;
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setAliCloudCertificateId(String aliCloudCertificateId) {
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }
        public String getAliCloudCertificateId() {
            return this.aliCloudCertificateId;
        }

    }

}
