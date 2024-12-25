// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The server certificates.</p>
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
        /**
         * <p>The tag keys of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag self = new DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
        /**
         * <p>The ID of the server certificate from Alibaba Cloud Certificate Management Service.</p>
         * 
         * <strong>example:</strong>
         * <p>7309********_15d97e7709a_71445759hr_789289731</p>
         */
        @NameInMap("AliCloudCertificateId")
        public String aliCloudCertificateId;

        /**
         * <p>The name of the server certificate from Alibaba Cloud Certificate Management Service.</p>
         * 
         * <strong>example:</strong>
         * <p>testcertkey</p>
         */
        @NameInMap("AliCloudCertificateName")
        public String aliCloudCertificateName;

        /**
         * <p>The domain name of the server certificate. The domain name is specified in the <code>CommonName</code> field.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The time when the server certificate was uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp when the server certificate was uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The time when the server certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-26T23:59:59Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The timestamp when the server certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>15041477450</p>
         */
        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        /**
         * <p>The fingerprint of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>68:08:1a:f8:2c:97:69:a3:a1:e6:16:41:4b:ca:4f:5d:ee:a5:ef:0d</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>Indicates whether the server certificate is from Alibaba Cloud Certificate Management Service. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsAliCloudCertificate")
        public Integer isAliCloudCertificate;

        /**
         * <p>The region ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The server certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123157********_166f8204689_1714763408_709981430-cn-east-hangzhou-02</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        /**
         * <p>The name of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ServerCertificateName")
        public String serverCertificateName;

        /**
         * <p>The alternative domain names of the server certificate. The alternative domain names are specified in the Subject Alternative Name field of the server certificate.</p>
         */
        @NameInMap("SubjectAlternativeNames")
        public DescribeServerCertificatesResponseBodyServerCertificatesServerCertificateSubjectAlternativeNames subjectAlternativeNames;

        /**
         * <p>The tags.</p>
         */
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
