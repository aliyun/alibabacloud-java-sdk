// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateListModel")
    public DescribeVsCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <strong>example:</strong>
     * <p>6E310519-E035-51AB-80D4-C1CBECD39EB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateListResponseBody self = new DescribeVsCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateListResponseBody setCertificateListModel(DescribeVsCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeVsCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeVsCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6338888</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <strong>example:</strong>
         * <p>cert-5391062</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <strong>example:</strong>
         * <p>3EB2585309AE5C8F369****7CDA6A8F5CEC8B2D4</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <strong>example:</strong>
         * <p>xxxxCert Inc</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>1632462708</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeVsCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsCertificateListResponseBodyCertificateListModelCertList self = new DescribeVsCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeVsCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> certList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DescribeVsCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsCertificateListResponseBodyCertificateListModel self = new DescribeVsCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeVsCertificateListResponseBodyCertificateListModel setCertList(java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> certList) {
            this.certList = certList;
            return this;
        }
        public java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> getCertList() {
            return this.certList;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
