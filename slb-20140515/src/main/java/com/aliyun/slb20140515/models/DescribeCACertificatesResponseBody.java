// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponseBody extends TeaModel {
    /**
     * <p>The information about the CA certificate.</p>
     */
    @NameInMap("CACertificates")
    public DescribeCACertificatesResponseBodyCACertificates CACertificates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
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
        /**
         * <p>The tag key.</p>
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
         * <p>The CA certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>139a00604bd-cn-east-hangzho****</p>
         */
        @NameInMap("CACertificateId")
        public String CACertificateId;

        /**
         * <p>The CA certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CACertificateName")
        public String CACertificateName;

        /**
         * <p>The domain name of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The time when the CA certificate was created. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp when the CA certificate was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The time when the CA certificate expires. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21T06:04:25Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The timestamp that indicates when the CA certificate expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1732169065000</p>
         */
        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        /**
         * <p>The fingerprint of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>79:43:fb:7d:a4:7f:44:32:61:16:57:17:e3:e8:b7:36:03:57:f6:89</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The region of the CA certificate.</p>
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
         * <p>The tag.</p>
         */
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
