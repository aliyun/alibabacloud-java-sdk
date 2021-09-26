// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class CreateInstanceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceConnectionResponseBody body;

    public static CreateInstanceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceConnectionResponse self = new CreateInstanceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceConnectionResponse setBody(CreateInstanceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceConnectionResponseBody getBody() {
        return this.body;
    }

}
