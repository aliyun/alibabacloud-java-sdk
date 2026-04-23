// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponseBody extends TeaModel {
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
        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertId")
        public String certId;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertOrg")
        public String certOrg;

        @NameInMap("CertRegion")
        public String certRegion;

        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ServerCertificate")
        public String serverCertificate;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

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
