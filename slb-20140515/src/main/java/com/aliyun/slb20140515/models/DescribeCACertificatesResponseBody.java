// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CACertificates")
    public DescribeCACertificatesResponseBodyCACertificates CACertificates;

    public static DescribeCACertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificatesResponseBody self = new DescribeCACertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCACertificatesResponseBody setCACertificates(DescribeCACertificatesResponseBodyCACertificates CACertificates) {
        this.CACertificates = CACertificates;
        return this;
    }
    public DescribeCACertificatesResponseBodyCACertificates getCACertificates() {
        return this.CACertificates;
    }

    public static class DescribeCACertificatesResponseBodyCACertificatesCACertificate extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTimeStamp")
        public Long expireTimeStamp;

        @NameInMap("CACertificateId")
        public String CACertificateId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CACertificateName")
        public String CACertificateName;

        public static DescribeCACertificatesResponseBodyCACertificatesCACertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificatesCACertificate self = new DescribeCACertificatesResponseBodyCACertificatesCACertificate();
            return TeaModel.build(map, self);
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

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificatesResponseBodyCACertificatesCACertificate setCACertificateName(String CACertificateName) {
            this.CACertificateName = CACertificateName;
            return this;
        }
        public String getCACertificateName() {
            return this.CACertificateName;
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
