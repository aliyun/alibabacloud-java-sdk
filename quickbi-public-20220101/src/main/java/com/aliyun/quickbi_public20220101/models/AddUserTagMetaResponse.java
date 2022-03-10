// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserTagMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserTagMetaResponseBody body;

    public static AddUserTagMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserTagMetaResponse self = new AddUserTagMetaResponse();
        return TeaModel.build(map, self);
    }

    public AddUserTagMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserTagMetaResponse setBody(AddUserTagMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserTagMetaResponseBody getBody() {
        return this.body;
    }

}
