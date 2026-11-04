// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLakebaseS3AccountPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLakebaseS3AccountPolicyResponseBody body;

    public static ModifyLakebaseS3AccountPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakebaseS3AccountPolicyResponse self = new ModifyLakebaseS3AccountPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLakebaseS3AccountPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLakebaseS3AccountPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLakebaseS3AccountPolicyResponse setBody(ModifyLakebaseS3AccountPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLakebaseS3AccountPolicyResponseBody getBody() {
        return this.body;
    }

}
