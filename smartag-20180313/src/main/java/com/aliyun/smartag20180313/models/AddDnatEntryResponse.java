// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddDnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDnatEntryResponseBody body;

    public static AddDnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnatEntryResponse self = new AddDnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddDnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnatEntryResponse setBody(AddDnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnatEntryResponseBody getBody() {
        return this.body;
    }

}
