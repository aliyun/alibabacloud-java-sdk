// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CACertificates")
    public java.util.List<DescribeCACertificatesResponseBodyCACertificates> CACertificates;

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

    public DescribeCACertificatesResponseBody setCACertificates(java.util.List<DescribeCACertificatesResponseBodyCACertificates> CACertificates) {
        this.CACertificates = CACertificates;
        return this;
    }
    public java.util.List<DescribeCACertificatesResponseBodyCACertificates> getCACertificates() {
        return this.CACertificates;
    }

    public static class DescribeCACertificatesResponseBodyCACertificates extends TeaModel {
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

        public static DescribeCACertificatesResponseBodyCACertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesResponseBodyCACertificates self = new DescribeCACertificatesResponseBodyCACertificates();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificatesResponseBodyCACertificates setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeCACertificatesResponseBodyCACertificates setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCACertificatesResponseBodyCACertificates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCACertificatesResponseBodyCACertificates setExpireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }
        public Long getExpireTimeStamp() {
            return this.expireTimeStamp;
        }

        public DescribeCACertificatesResponseBodyCACertificates setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public DescribeCACertificatesResponseBodyCACertificates setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCACertificatesResponseBodyCACertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeCACertificatesResponseBodyCACertificates setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCACertificatesResponseBodyCACertificates setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificatesResponseBodyCACertificates setCACertificateName(String CACertificateName) {
            this.CACertificateName = CACertificateName;
            return this;
        }
        public String getCACertificateName() {
            return this.CACertificateName;
        }

    }

}
