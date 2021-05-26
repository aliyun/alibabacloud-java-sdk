// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerCertificates")
    public DescribeServerCertificatesResponseBodyServerCertificates serverCertificates;

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

    public DescribeServerCertificatesResponseBody setServerCertificates(DescribeServerCertificatesResponseBodyServerCertificates serverCertificates) {
        this.serverCertificates = serverCertificates;
        return this;
    }
    public DescribeServerCertificatesResponseBodyServerCertificates getServerCertificates() {
        return this.serverCertificates;
    }

    public static class DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames extends TeaModel {
        @NameInMap("SubjectAlternativeName")
        public java.util.List<String> subjectAlternativeName;

        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames setSubjectAlternativeName(java.util.List<String> subjectAlternativeName) {
            this.subjectAlternativeName = subjectAlternativeName;
            return this;
        }
        public java.util.List<String> getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

    }

    public static class DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("AliCloudCertificateName")
        public String aliCloudCertificateName;

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

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("IsAliCloudCertificate")
        public Integer isAliCloudCertificate;

        @NameInMap("AliCloudCertificateId")
        public String aliCloudCertificateId;

        @NameInMap("SubjectAlternativeNames")
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames subjectAlternativeNames;

        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setAliCloudCertificateName(String aliCloudCertificateName) {
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }
        public String getAliCloudCertificateName() {
            return this.aliCloudCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setIsAliCloudCertificate(Integer isAliCloudCertificate) {
            this.isAliCloudCertificate = isAliCloudCertificate;
            return this;
        }
        public Integer getIsAliCloudCertificate() {
            return this.isAliCloudCertificate;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setAliCloudCertificateId(String aliCloudCertificateId) {
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }
        public String getAliCloudCertificateId() {
            return this.aliCloudCertificateId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setSubjectAlternativeNames(DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

    }

    public static class DescribeServerCertificatesResponseBodyServerCertificates extends TeaModel {
        @NameInMap("ServerCertificate")
        public java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate> serverCertificate;

        public static DescribeServerCertificatesResponseBodyServerCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificates self = new DescribeServerCertificatesResponseBodyServerCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificates setServerCertificate(java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate> serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate> getServerCertificate() {
            return this.serverCertificate;
        }

    }

}
