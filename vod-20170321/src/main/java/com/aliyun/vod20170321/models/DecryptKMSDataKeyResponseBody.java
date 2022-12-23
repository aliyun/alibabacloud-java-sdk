// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyResponseBody extends TeaModel {
    // The ID of the customer master key (CMK) that was used to decrypt the ciphertext.
    @NameInMap("KeyId")
    public String keyId;

    // The plaintext that is generated after decryption.
    @NameInMap("Plaintext")
    public String plaintext;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DecryptKMSDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecryptKMSDataKeyResponseBody self = new DecryptKMSDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DecryptKMSDataKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DecryptKMSDataKeyResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public DecryptKMSDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
