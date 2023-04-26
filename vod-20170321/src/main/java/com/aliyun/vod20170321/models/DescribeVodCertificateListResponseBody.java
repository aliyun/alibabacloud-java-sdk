// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListResponseBody extends TeaModel {
    /**
     * <p>The common name of the certificate.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeVodCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The certificate authority (CA) that issued the certificate.</p>
     */
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
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeVodCertificateList**.</p>
         */
        @NameInMap("CertName")
        public String certName;

        @NameInMap("Common")
        public String common;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>Queries the certificates of a specified domain name for CDN or all the domain names for CDN within your Alibaba Cloud account.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The details of each certificate.</p>
         */
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
        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertList")
        public DescribeVodCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates.</p>
         */
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
