// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmDataResponseBody body;

    public static AddMsDrmDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDataResponse self = new AddMsDrmDataResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmDataResponse setBody(AddMsDrmDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmDataResponseBody getBody() {
        return this.body;
    }

}
