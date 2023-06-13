// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateInstanceKeyPairResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceKeyPairResponseBody self = new CreateInstanceKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceKeyPairResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public CreateInstanceKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateInstanceKeyPairResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateInstanceKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
