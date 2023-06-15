// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteSlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSlotResponseBody body;

    public static DeleteSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlotResponse self = new DeleteSlotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSlotResponse setBody(DeleteSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSlotResponseBody getBody() {
        return this.body;
    }

}
