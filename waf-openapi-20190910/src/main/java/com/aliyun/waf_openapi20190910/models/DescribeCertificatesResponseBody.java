// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertificatesResponseBody extends TeaModel {
    @NameInMap("Certificates")
    public java.util.List<DescribeCertificatesResponseBodyCertificates> certificates;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatesResponseBody self = new DescribeCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatesResponseBody setCertificates(java.util.List<DescribeCertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<DescribeCertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public DescribeCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCertificatesResponseBodyCertificates extends TeaModel {
        @NameInMap("CertificateId")
        public Long certificateId;

        @NameInMap("CertificateName")
        public String certificateName;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("IsUsing")
        public Boolean isUsing;

        @NameInMap("Sans")
        public java.util.List<String> sans;

        public static DescribeCertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertificatesResponseBodyCertificates self = new DescribeCertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeCertificatesResponseBodyCertificates setCertificateId(Long certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Long getCertificateId() {
            return this.certificateId;
        }

        public DescribeCertificatesResponseBodyCertificates setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeCertificatesResponseBodyCertificates setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCertificatesResponseBodyCertificates setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeCertificatesResponseBodyCertificates setIsUsing(Boolean isUsing) {
            this.isUsing = isUsing;
            return this;
        }
        public Boolean getIsUsing() {
            return this.isUsing;
        }

        public DescribeCertificatesResponseBodyCertificates setSans(java.util.List<String> sans) {
            this.sans = sans;
            return this;
        }
        public java.util.List<String> getSans() {
            return this.sans;
        }

    }

}
