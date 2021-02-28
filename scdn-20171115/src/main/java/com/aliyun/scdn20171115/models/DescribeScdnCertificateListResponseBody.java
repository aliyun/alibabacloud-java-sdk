// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCertificateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateListModel")
    public DescribeScdnCertificateListResponseBodyCertificateListModel certificateListModel;

    public static DescribeScdnCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCertificateListResponseBody self = new DescribeScdnCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnCertificateListResponseBody setCertificateListModel(DescribeScdnCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeScdnCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public static class DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("Common")
        public String common;

        public static DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

    }

    public static class DescribeScdnCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeScdnCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCertificateListResponseBodyCertificateListModelCertList self = new DescribeScdnCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeScdnCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeScdnCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public DescribeScdnCertificateListResponseBodyCertificateListModelCertList certList;

        @NameInMap("Count")
        public Integer count;

        public static DescribeScdnCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCertificateListResponseBodyCertificateListModel self = new DescribeScdnCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModel setCertList(DescribeScdnCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeScdnCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeScdnCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
