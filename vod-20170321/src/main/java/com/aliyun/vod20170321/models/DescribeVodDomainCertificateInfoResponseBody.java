// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The certificate information.</p>
     */
    @NameInMap("CertInfos")
    public DescribeVodDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-****-7D5ECEB547A1</p>
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
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The time at which the certificate expires. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-03T13:03:39Z</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>13227737-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The validity period of the certificate. Unit: months or years.</p>
         * 
         * <strong>example:</strong>
         * <p>3 months</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-example.com</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Let\&quot;s Encrypt</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The region where the certificate is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The time when the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-26T20:23:38Z</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>free</strong>: a free certificate.</li>
         * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service.</li>
         * <li><strong>upload</strong>: a user-uploaded certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time at which the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-26T20:23:38Z</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>The CNAME status of the domain name.</p>
         * <ul>
         * <li><strong>ok</strong>: The domain name points to the CNAME assigned by Alibaba Cloud CDN.</li>
         * <li><strong>cname_error</strong>: An error occurred and the domain name cannot point to the CNAME.</li>
         * <li><strong>op_domain_cname_error</strong> : An error occurred to the CNAME of the top-level domain. The domain name cannot point to the CNAME.</li>
         * <li><strong>unsupport_wildcard</strong>: The wildcard domain name is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        /**
         * <p>The accelerated domain name whose ICP filing status you want to update.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The public key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ServerCertificate")
        public String serverCertificate;

        /**
         * <p>The status of the SSL certificate.</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>checking</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The status of the certificate.</p>
         * <ul>
         * <li><strong>success</strong>: The certificate is in effect.</li>
         * <li><strong>checking</strong>: The system is checking whether the domain name is added to ApsaraVideo VOD.</li>
         * <li><strong>cname_error</strong>: The domain name is not added to ApsaraVideo VOD.</li>
         * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
         * <li><strong>unsupport_wildcard</strong>: The domain name is a wildcard domain name. Wildcard domain names are not supported.</li>
         * <li><strong>applying</strong>: The certificate application is in progress.</li>
         * <li><strong>failed</strong>: The certificate application failed.</li>
         * </ul>
         * <blockquote>
         * <p> A value is returned for this parameter only when you set <code>CertType</code> to <code>free</code>. Otherwise, an empty value is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
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

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainCnameStatus(String domainCnameStatus) {
            this.domainCnameStatus = domainCnameStatus;
            return this;
        }
        public String getDomainCnameStatus() {
            return this.domainCnameStatus;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificate(String serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public String getServerCertificate() {
            return this.serverCertificate;
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
