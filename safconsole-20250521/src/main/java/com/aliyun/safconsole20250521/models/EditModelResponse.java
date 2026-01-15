// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class EditModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditModelResponseBody body;

    public static EditModelResponse build(java.util.Map<String, ?> map) throws Exception {
        EditModelResponse self = new EditModelResponse();
        return TeaModel.build(map, self);
    }

    public EditModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditModelResponse setBody(EditModelResponseBody body) {
        this.body = body;
        return this;
    }
    public EditModelResponseBody getBody() {
        return this.body;
    }

}
