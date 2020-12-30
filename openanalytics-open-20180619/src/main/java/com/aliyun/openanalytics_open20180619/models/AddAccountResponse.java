// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAccountResponseBody body;

    public static AddAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountResponse self = new AddAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccountResponse setBody(AddAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccountResponseBody getBody() {
        return this.body;
    }

}
