// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the public key.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PublicKeyId")
    public String publicKeyId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5EAB922E-F476-5DFA-9290-313C608E724B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPublicKeyResponseBody self = new CreateUserPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserPublicKeyResponseBody setPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
        return this;
    }
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    public CreateUserPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
