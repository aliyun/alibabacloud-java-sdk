// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class ProduceAikcertRequest extends TeaModel {
    @NameInMap("AikName")
    public String aikName;

    @NameInMap("CertRequest")
    public String certRequest;

    @NameInMap("EkCert")
    public String ekCert;

    @NameInMap("EkPubKey")
    public String ekPubKey;

    @NameInMap("IncludeCertChain")
    public Boolean includeCertChain;

    public static ProduceAikcertRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceAikcertRequest self = new ProduceAikcertRequest();
        return TeaModel.build(map, self);
    }

    public ProduceAikcertRequest setAikName(String aikName) {
        this.aikName = aikName;
        return this;
    }
    public String getAikName() {
        return this.aikName;
    }

    public ProduceAikcertRequest setCertRequest(String certRequest) {
        this.certRequest = certRequest;
        return this;
    }
    public String getCertRequest() {
        return this.certRequest;
    }

    public ProduceAikcertRequest setEkCert(String ekCert) {
        this.ekCert = ekCert;
        return this;
    }
    public String getEkCert() {
        return this.ekCert;
    }

    public ProduceAikcertRequest setEkPubKey(String ekPubKey) {
        this.ekPubKey = ekPubKey;
        return this;
    }
    public String getEkPubKey() {
        return this.ekPubKey;
    }

    public ProduceAikcertRequest setIncludeCertChain(Boolean includeCertChain) {
        this.includeCertChain = includeCertChain;
        return this;
    }
    public Boolean getIncludeCertChain() {
        return this.includeCertChain;
    }

}
