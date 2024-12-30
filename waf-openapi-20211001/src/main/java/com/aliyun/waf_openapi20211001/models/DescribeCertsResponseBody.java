// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCertsResponseBody extends TeaModel {
    /**
     * <p>The certificates.</p>
     */
    @NameInMap("Certs")
    public java.util.List<DescribeCertsResponseBodyCerts> certs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>19511B0D-5AE0-5600-BB8A-DC2C8345****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertsResponseBody self = new DescribeCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertsResponseBody setCerts(java.util.List<DescribeCertsResponseBodyCerts> certs) {
        this.certs = certs;
        return this;
    }
    public java.util.List<DescribeCertsResponseBodyCerts> getCerts() {
        return this.certs;
    }

    public DescribeCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCertsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCertsResponseBodyCerts extends TeaModel {
        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1976256736582</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The effective time.</p>
         * 
         * <strong>example:</strong>
         * <p>1976256836582</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The globally unique ID of the certificate. The value follows a &quot;\<Certificate ID>-ap-southeast-1&quot; format. For example, if the ID of the certificate is 123, the value of the CertIdentifier parameter is 123-ap-southeast-1.</p>
         * 
         * <strong>example:</strong>
         * <p>123-ap-southeast-1</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>waf1234</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The common name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The domain that is supported by the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the certificate chain is complete. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsChainCompleted")
        public Boolean isChainCompleted;

        public static DescribeCertsResponseBodyCerts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertsResponseBodyCerts self = new DescribeCertsResponseBodyCerts();
            return TeaModel.build(map, self);
        }

        public DescribeCertsResponseBodyCerts setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeCertsResponseBodyCerts setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeCertsResponseBodyCerts setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeCertsResponseBodyCerts setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCertsResponseBodyCerts setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCertsResponseBodyCerts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCertsResponseBodyCerts setIsChainCompleted(Boolean isChainCompleted) {
            this.isChainCompleted = isChainCompleted;
            return this;
        }
        public Boolean getIsChainCompleted() {
            return this.isChainCompleted;
        }

    }

}
