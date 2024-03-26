// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceInstanceCertsResponseBody extends TeaModel {
    @NameInMap("Certs")
    public java.util.List<DescribeResourceInstanceCertsResponseBodyCerts> certs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeResourceInstanceCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceInstanceCertsResponseBody self = new DescribeResourceInstanceCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceInstanceCertsResponseBody setCerts(java.util.List<DescribeResourceInstanceCertsResponseBodyCerts> certs) {
        this.certs = certs;
        return this;
    }
    public java.util.List<DescribeResourceInstanceCertsResponseBodyCerts> getCerts() {
        return this.certs;
    }

    public DescribeResourceInstanceCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceInstanceCertsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeResourceInstanceCertsResponseBodyCerts extends TeaModel {
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("IsChainCompleted")
        public Boolean isChainCompleted;

        public static DescribeResourceInstanceCertsResponseBodyCerts build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceInstanceCertsResponseBodyCerts self = new DescribeResourceInstanceCertsResponseBodyCerts();
            return TeaModel.build(map, self);
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeResourceInstanceCertsResponseBodyCerts setIsChainCompleted(Boolean isChainCompleted) {
            this.isChainCompleted = isChainCompleted;
            return this;
        }
        public Boolean getIsChainCompleted() {
            return this.isChainCompleted;
        }

    }

}
