// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateInstanceKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>If2K1ItazA4GlKkWCEhdRj8Wd6czAvK9*****</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The private key.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
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
