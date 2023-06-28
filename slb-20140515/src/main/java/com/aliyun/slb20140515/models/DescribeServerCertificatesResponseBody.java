// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponseBody extends TeaModel {
    /**
     * <p>The timestamp generated when the server certificate is uploaded.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of server certificates.</p>
     */
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

    public static class DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag extends TeaModel {
        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag> tag;

        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags setTag(java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate extends TeaModel {
        @NameInMap("AliCloudCertificateId")
        public String aliCloudCertificateId;

        /**
         * <p>The time when the server certificate is uploaded.</p>
         */
        @NameInMap("AliCloudCertificateName")
        public String aliCloudCertificateName;

        /**
         * <p>The ID of the server certificate from Alibaba Cloud Certificate Management Service.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The ID of the region where the server certificate is created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeServerCertificates**.</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the server certificate is from Alibaba Cloud Certificate Management Service. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        /**
         * <p>The name of the server certificate from Alibaba Cloud Certificate Management Service.</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("IsAliCloudCertificate")
        public Integer isAliCloudCertificate;

        /**
         * <p>The ID of the server certificate.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The region where the CLB instances are deployed.</p>
         * <br>
         * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
         * <br>
         * <p>>  If the endpoint of the region is slb.aliyuncs.com, you must specify the `RegionId` parameter.</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        /**
         * <p>The timestamp that indicates when the certificate expires.</p>
         */
        @NameInMap("ServerCertificateName")
        public String serverCertificateName;

        @NameInMap("SubjectAlternativeNames")
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames subjectAlternativeNames;

        @NameInMap("Tags")
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags tags;

        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setAliCloudCertificateId(String aliCloudCertificateId) {
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }
        public String getAliCloudCertificateId() {
            return this.aliCloudCertificateId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setAliCloudCertificateName(String aliCloudCertificateName) {
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }
        public String getAliCloudCertificateName() {
            return this.aliCloudCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setIsAliCloudCertificate(Integer isAliCloudCertificate) {
            this.isAliCloudCertificate = isAliCloudCertificate;
            return this;
        }
        public Integer getIsAliCloudCertificate() {
            return this.isAliCloudCertificate;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setServerCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }
        public String getServerCertificateName() {
            return this.serverCertificateName;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setSubjectAlternativeNames(DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificate setTags(DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTags getTags() {
            return this.tags;
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
