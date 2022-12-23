// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListResponseBody extends TeaModel {
    // The information about the returned certificates.
    @NameInMap("CertificateListModel")
    public DescribeVodCertificateListResponseBodyCertificateListModel certificateListModel;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateListResponseBody self = new DescribeVodCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodCertificateListResponseBody setCertificateListModel(DescribeVodCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeVodCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeVodCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        // The ID of the certificate.
        @NameInMap("CertId")
        public Long certId;

        // The name of the certificate.
        @NameInMap("CertName")
        public String certName;

        // The common name of the certificate.
        @NameInMap("Common")
        public String common;

        // The fingerprint of the certificate.
        @NameInMap("Fingerprint")
        public String fingerprint;

        // The certificate authority (CA) that issued the certificate.
        @NameInMap("Issuer")
        public String issuer;

        // The time when the certificate was issued. Unit: seconds.
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeVodCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeVodCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeVodCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeVodCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeVodCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseBodyCertificateListModelCertList self = new DescribeVodCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeVodCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeVodCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeVodCertificateListResponseBodyCertificateListModel extends TeaModel {
        // The details of each certificate.
        @NameInMap("CertList")
        public DescribeVodCertificateListResponseBodyCertificateListModelCertList certList;

        // The number of certificates.
        @NameInMap("Count")
        public Integer count;

        public static DescribeVodCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseBodyCertificateListModel self = new DescribeVodCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodCertificateListResponseBodyCertificateListModel setCertList(DescribeVodCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeVodCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
