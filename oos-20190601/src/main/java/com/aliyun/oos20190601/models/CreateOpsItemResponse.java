// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateOpsItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpsItemResponseBody body;

    public static CreateOpsItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpsItemResponse self = new CreateOpsItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpsItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpsItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpsItemResponse setBody(CreateOpsItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpsItemResponseBody getBody() {
        return this.body;
    }

}
