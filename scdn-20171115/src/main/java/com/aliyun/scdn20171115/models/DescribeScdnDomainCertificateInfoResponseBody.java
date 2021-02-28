// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeScdnDomainCertificateInfoResponseBodyCertInfos certInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCertificateInfoResponseBody self = new DescribeScdnDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCertificateInfoResponseBody setCertInfos(DescribeScdnDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeScdnDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeScdnDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertOrg")
        public String certOrg;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeScdnDomainCertificateInfoResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeScdnDomainCertificateInfoResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainCertificateInfoResponseBodyCertInfos self = new DescribeScdnDomainCertificateInfoResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainCertificateInfoResponseBodyCertInfos setCertInfo(java.util.List<DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeScdnDomainCertificateInfoResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
