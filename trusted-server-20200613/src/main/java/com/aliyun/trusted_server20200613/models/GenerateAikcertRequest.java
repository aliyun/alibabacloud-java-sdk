// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class GenerateAikcertRequest extends TeaModel {
    @NameInMap("AikName")
    public String aikName;

    @NameInMap("AikPub")
    public String aikPub;

    @NameInMap("EkCert")
    public String ekCert;

    @NameInMap("EkPub")
    public String ekPub;

    @NameInMap("NonceDigest")
    public String nonceDigest;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static GenerateAikcertRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAikcertRequest self = new GenerateAikcertRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAikcertRequest setAikName(String aikName) {
        this.aikName = aikName;
        return this;
    }
    public String getAikName() {
        return this.aikName;
    }

    public GenerateAikcertRequest setAikPub(String aikPub) {
        this.aikPub = aikPub;
        return this;
    }
    public String getAikPub() {
        return this.aikPub;
    }

    public GenerateAikcertRequest setEkCert(String ekCert) {
        this.ekCert = ekCert;
        return this;
    }
    public String getEkCert() {
        return this.ekCert;
    }

    public GenerateAikcertRequest setEkPub(String ekPub) {
        this.ekPub = ekPub;
        return this;
    }
    public String getEkPub() {
        return this.ekPub;
    }

    public GenerateAikcertRequest setNonceDigest(String nonceDigest) {
        this.nonceDigest = nonceDigest;
        return this;
    }
    public String getNonceDigest() {
        return this.nonceDigest;
    }

    public GenerateAikcertRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
