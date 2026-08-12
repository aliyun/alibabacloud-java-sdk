// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceInstanceCertsResponseBody extends TeaModel {
    /**
     * <p>The certificate results.</p>
     */
    @NameInMap("Certs")
    public java.util.List<DescribeResourceInstanceCertsResponseBodyCerts> certs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-***-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The expiration time of the certificate. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1708415521211</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The issuance time of the certificate. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1708415521211</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The global certificate ID, which is in the format of certificate ID + &quot;-cn-hangzhou&quot;. For example, if the certificate ID is 123, the CertIdentifier is &quot;123-cn-hangzhou&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cert-name</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The common name (CN).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundemo.com">www.aliyundemo.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The domain name supported by the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>waf.aliyundemo.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the certificate chain is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
