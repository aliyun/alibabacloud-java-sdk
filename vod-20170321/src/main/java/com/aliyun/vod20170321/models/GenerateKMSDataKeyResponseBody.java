// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateKMSDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateKMSDataKeyResponseBody self = new GenerateKMSDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateKMSDataKeyResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public GenerateKMSDataKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateKMSDataKeyResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public GenerateKMSDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
