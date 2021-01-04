// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSnatEntryResponseBody body;

    public static AddSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSnatEntryResponse self = new AddSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSnatEntryResponse setBody(AddSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSnatEntryResponseBody getBody() {
        return this.body;
    }

}
