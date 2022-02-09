// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncKafkaProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsObSyncKafkaProjectResponseBody body;

    public static CreateOmsObSyncKafkaProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncKafkaProjectResponse self = new CreateOmsObSyncKafkaProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncKafkaProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsObSyncKafkaProjectResponse setBody(CreateOmsObSyncKafkaProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsObSyncKafkaProjectResponseBody getBody() {
        return this.body;
    }

}
