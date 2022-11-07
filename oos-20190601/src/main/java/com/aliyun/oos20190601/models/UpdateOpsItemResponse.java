// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOpsItemResponseBody body;

    public static UpdateOpsItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpsItemResponse self = new UpdateOpsItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOpsItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOpsItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOpsItemResponse setBody(UpdateOpsItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOpsItemResponseBody getBody() {
        return this.body;
    }

}
