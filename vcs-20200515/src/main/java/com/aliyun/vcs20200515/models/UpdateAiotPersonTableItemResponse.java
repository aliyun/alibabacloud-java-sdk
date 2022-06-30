// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiotPersonTableItemResponseBody body;

    public static UpdateAiotPersonTableItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableItemResponse self = new UpdateAiotPersonTableItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiotPersonTableItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiotPersonTableItemResponse setBody(UpdateAiotPersonTableItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiotPersonTableItemResponseBody getBody() {
        return this.body;
    }

}
