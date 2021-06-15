// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRelativePositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRelativePositionResponseBody body;

    public static AddRelativePositionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRelativePositionResponse self = new AddRelativePositionResponse();
        return TeaModel.build(map, self);
    }

    public AddRelativePositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRelativePositionResponse setBody(AddRelativePositionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRelativePositionResponseBody getBody() {
        return this.body;
    }

}
