// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the CA certificate.</p>
     */
    @NameInMap("CACertificates")
    public DescribeCACertificatesResponseBodyCACertificates CACertificates;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeCACertificates**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCACertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificatesResponseBody self = new DescribeCACertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificatesResponseBody setCACertificates(DescribeCACertificatesResponseBodyCACertificates CACertificates) {
        this.CACertificates = CACertificates;
        return this;
    }
    public DescribeCACertificatesResponseBodyCACertificates getCACertificates() {
        return this.CACertificates;
    }

    public DescribeCACertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag self = new DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCACertificatesResponseBodyCACertificatesCACertificateTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag> tag;

        public static DescribeCACertificatesResponseBodyCACertificatesCACertificateTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificatesCACertificateTags self = new DescribeCACertificatesResponseBodyCACertificatesCACertificateTags();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificateTags setTag(java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificateTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCACertificatesResponseBodyCACertificatesCACertificate extends TeaModel {
        /**
         * <p>The ID of the CA certificate.</p>
         */
        @NameInMap("CACertificateId")
        public String CACertificateId;

        @NameInMap("CACertificateName")
        public String CACertificateName;

        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The time when the CA certificate expires. The time is in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The information about the CA certificate.</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The region where the CA certificates are created.</p>
         * <br>
         * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The name of the CA certificate.</p>
         */
        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        /**
         * <p>The region where the CA certificate is created.</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeCACertificatesResponseBodyCACertificatesCACertificateTags tags;

        public static DescribeCACertificatesResponseBodyCACertificatesCACertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificatesCACertificate self = new DescribeCACertificatesResponseBodyCACertificatesCACertificate();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCACertificateName(String CACertificateName) {
            this.CACertificateName = CACertificateName;
            return this;
        }
        public String getCACertificateName() {
            return this.CACertificateName;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setTags(DescribeCACertificatesResponseBodyCACertificatesCACertificateTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCACertificatesResponseBodyCACertificatesCACertificateTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeCACertificatesResponseBodyCACertificates extends TeaModel {
        @NameInMap("CACertificate")
        public java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificate> CACertificate;

        public static DescribeCACertificatesResponseBodyCACertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificates self = new DescribeCACertificatesResponseBodyCACertificates();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificatesResponseBodyCACertificates setCACertificate(java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificate> CACertificate) {
            this.CACertificate = CACertificate;
            return this;
        }
        public java.util.List<DescribeCACertificatesResponseBodyCACertificatesCACertificate> getCACertificate() {
            return this.CACertificate;
        }

    }

}
