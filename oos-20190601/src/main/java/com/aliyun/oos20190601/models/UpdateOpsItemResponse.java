// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateOpsItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
