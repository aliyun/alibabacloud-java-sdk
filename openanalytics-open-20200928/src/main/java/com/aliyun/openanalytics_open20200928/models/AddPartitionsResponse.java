// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AddPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPartitionsResponseBody body;

    public static AddPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPartitionsResponse self = new AddPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public AddPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPartitionsResponse setBody(AddPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPartitionsResponseBody getBody() {
        return this.body;
    }

}
