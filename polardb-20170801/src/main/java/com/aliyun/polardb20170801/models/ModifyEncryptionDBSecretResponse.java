// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyEncryptionDBSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEncryptionDBSecretResponseBody body;

    public static ModifyEncryptionDBSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEncryptionDBSecretResponse self = new ModifyEncryptionDBSecretResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEncryptionDBSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEncryptionDBSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEncryptionDBSecretResponse setBody(ModifyEncryptionDBSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEncryptionDBSecretResponseBody getBody() {
        return this.body;
    }

}
