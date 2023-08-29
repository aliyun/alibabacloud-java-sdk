// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class GenerateNonceRequest extends TeaModel {
    @NameInMap("AikName")
    public String aikName;

    @NameInMap("EkCert")
    public String ekCert;

    @NameInMap("EkPub")
    public String ekPub;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static GenerateNonceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateNonceRequest self = new GenerateNonceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateNonceRequest setAikName(String aikName) {
        this.aikName = aikName;
        return this;
    }
    public String getAikName() {
        return this.aikName;
    }

    public GenerateNonceRequest setEkCert(String ekCert) {
        this.ekCert = ekCert;
        return this;
    }
    public String getEkCert() {
        return this.ekCert;
    }

    public GenerateNonceRequest setEkPub(String ekPub) {
        this.ekPub = ekPub;
        return this;
    }
    public String getEkPub() {
        return this.ekPub;
    }

    public GenerateNonceRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
