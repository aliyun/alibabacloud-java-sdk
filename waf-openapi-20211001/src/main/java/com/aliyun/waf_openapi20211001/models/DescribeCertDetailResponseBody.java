// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCertDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the certificate.</p>
     */
    @NameInMap("CertDetail")
    public DescribeCertDetailResponseBodyCertDetail certDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertDetailResponseBody self = new DescribeCertDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertDetailResponseBody setCertDetail(DescribeCertDetailResponseBodyCertDetail certDetail) {
        this.certDetail = certDetail;
        return this;
    }
    public DescribeCertDetailResponseBodyCertDetail getCertDetail() {
        return this.certDetail;
    }

    public DescribeCertDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCertDetailResponseBodyCertDetail extends TeaModel {
        /**
         * <p>The time when the certificate expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The time when the certificate was issued. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The primary domain name, which is a common name.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The domain name that is associated with the certificate.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The other domain names that are associated with the certificate.</p>
         */
        @NameInMap("Sans")
        public java.util.List<String> sans;

        public static DescribeCertDetailResponseBodyCertDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertDetailResponseBodyCertDetail self = new DescribeCertDetailResponseBodyCertDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCertDetailResponseBodyCertDetail setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeCertDetailResponseBodyCertDetail setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeCertDetailResponseBodyCertDetail setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeCertDetailResponseBodyCertDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCertDetailResponseBodyCertDetail setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCertDetailResponseBodyCertDetail setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCertDetailResponseBodyCertDetail setSans(java.util.List<String> sans) {
            this.sans = sans;
            return this;
        }
        public java.util.List<String> getSans() {
            return this.sans;
        }

    }

}
