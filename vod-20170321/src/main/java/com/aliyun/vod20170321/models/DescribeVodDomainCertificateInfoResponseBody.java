// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The certificate information about the domain name.</p>
     */
    @NameInMap("CertInfos")
    public DescribeVodDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The domain name that matches the certificate.</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The time at which the certificate expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The validity period of the certificate. Unit: months or years.</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <br>
         * <p>*   **free**: a free certificate.</p>
         * <p>*   **cas**: a certificate that is purchased from Certificate Management Service.</p>
         * <p>*   **upload**: a user-uploaded certificate.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Indicates whether the SSL certificate is enabled.</p>
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **success**: The certificate is in effect.</p>
         * <p>*   **checking**: The system is checking whether the domain name is added to ApsaraVideo VOD.</p>
         * <p>*   **cname_error**: The domain name is not added to ApsaraVideo VOD.</p>
         * <p>*   **domain_invalid**: The domain name contains invalid characters.</p>
         * <p>*   **unsupport_wildcard**: The domain name is a wildcard domain name. Wildcard domain names are not supported.</p>
         * <p>*   **applying**: The certificate application is in progress.</p>
         * <p>*   **failed**: The certificate application failed.</p>
         * <br>
         * <p>> A value is returned for this parameter only if `free` is returned for `CertType`. If a value other than free is returned for CertType, an empty string is returned for this parameter.</p>
         */
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
