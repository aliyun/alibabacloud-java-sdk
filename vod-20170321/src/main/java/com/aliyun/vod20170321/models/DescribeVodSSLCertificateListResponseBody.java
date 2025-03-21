// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodSSLCertificateListResponseBody extends TeaModel {
    /**
     * <p>The information about certificates.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeVodSSLCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodSSLCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodSSLCertificateListResponseBody self = new DescribeVodSSLCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodSSLCertificateListResponseBody setCertificateListModel(DescribeVodSSLCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeVodSSLCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeVodSSLCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>235437</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>video-ssl</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The region of the certificate. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The Common Name (CN) attribute of the certificate. In most cases, the CN is a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time when the certificate was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1512388610</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList self = new DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeVodSSLCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeVodSSLCertificateListResponseBodyCertificateListModel extends TeaModel {
        /**
         * <p>The list of certificates.</p>
         */
        @NameInMap("CertList")
        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values: integers from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        public static DescribeVodSSLCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodSSLCertificateListResponseBodyCertificateListModel self = new DescribeVodSSLCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModel setCertList(DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeVodSSLCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModel setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeVodSSLCertificateListResponseBodyCertificateListModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
