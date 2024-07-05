// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----xxxxx-----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <strong>example:</strong>
     * <p>63000000</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <strong>example:</strong>
     * <p>cert-539xxxxx</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>D94D0E1E-E71B-562D-8C18-969BB3653FBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateDetailResponseBody self = new DescribeVsCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeVsCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeVsCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeVsCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeVsCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
