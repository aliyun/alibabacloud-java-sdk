// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
    // The certificate information.
    @NameInMap("CertInfos")
    public DescribeVodDomainCertificateInfoResponseBodyCertInfos certInfos;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCertificateInfoResponseBody self = new DescribeVodDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainCertificateInfoResponseBody setCertInfos(DescribeVodDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeVodDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeVodDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        // The domain name that matches the certificate.
        @NameInMap("CertDomainName")
        public String certDomainName;

        // The time when the certificate expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        // The validity period of the certificate. Unit: month or year.
        @NameInMap("CertLife")
        public String certLife;

        // The name of the certificate.
        @NameInMap("CertName")
        public String certName;

        // The certificate authority (CA) that issued the certificate.
        @NameInMap("CertOrg")
        public String certOrg;

        // The type of the certificate. Valid values:
        // 
        // *   **free**: a free certificate.
        // *   **cas**: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.
        // *   **upload**: a user-uploaded certificate.
        @NameInMap("CertType")
        public String certType;

        // The domain name for CDN.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the server certificate.
        // 
        // *   **success**: indicates that the certificate has taken effect.
        // *   **checking**: indicates that the system is checking whether the domain name has been added to ApsaraVideo VOD.
        // *   **cname_error**: indicates that the domain name has not been added to ApsaraVideo VOD.
        // *   **domain_invalid**: indicates that the domain name contains invalid characters.
        // *   **unsupport_wildcard**: indicates that wildcard domain names are not supported.
        // *   **applying**: indicates that the certificate is in the application process.
        // *   **failed**: indicates that the request of applying for the certificate has failed.
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        // The status of the certificate.
        // 
        // *   **success**: indicates that the certificate has taken effect.
        // *   **checking**: indicates that the system is checking whether the domain name has been added to ApsaraVideo VOD.
        // *   **cname_error**: indicates that the domain name has not been added to ApsaraVideo VOD.
        // *   **domain_invalid**: indicates that the domain name contains invalid characters.
        // *   **unsupport_wildcard**: indicates that wildcard domain names are not supported.
        // *   **applying**: indicates that the certificate is in the application process.
        // *   **failed**: indicates that the request of applying for the certificate has failed.
        @NameInMap("Status")
        public String status;

        public static DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVodDomainCertificateInfoResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeVodDomainCertificateInfoResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCertificateInfoResponseBodyCertInfos self = new DescribeVodDomainCertificateInfoResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfos setCertInfo(java.util.List<DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
