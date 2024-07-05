// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the customer master key (CMK) that was used to decrypt the ciphertext.</p>
     * 
     * <strong>example:</strong>
     * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The plaintext that is generated after decryption.</p>
     * 
     * <strong>example:</strong>
     * <p>tRYXuCwgja12xxO1N/gZERDDCLw9doZEQiPDk/Bv****</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
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
