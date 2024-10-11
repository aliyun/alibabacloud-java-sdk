// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListResponseBody extends TeaModel {
    /**
     * <p>The information about each certificate.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeVodCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC0E34AC-0239-44A7-****-800DE522C8DA</p>
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
        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>235437</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>14173772-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>certificate</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The common name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>The time when the certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1725206400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>DomainMatchCert.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DomainMatchCert")
        public Boolean domainMatchCert;

        /**
         * <p>The time when the certificate expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1759507200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-cn-cd806ae0fdfbfa60</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time when the certificate was issued. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1512388610</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The signAlgorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256withrsa</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        public static DescribeVodCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeVodCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
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

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setDomainMatchCert(Boolean domainMatchCert) {
            this.domainMatchCert = domainMatchCert;
            return this;
        }
        public Boolean getDomainMatchCert() {
            return this.domainMatchCert;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

        public DescribeVodCertificateListResponseBodyCertificateListModelCertListCert setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
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
         * <p>The list of certificates.</p>
         */
        @NameInMap("CertList")
        public DescribeVodCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
