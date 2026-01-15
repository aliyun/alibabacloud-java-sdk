// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DuplicateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DuplicateModelResponseBody body;

    public static DuplicateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DuplicateModelResponse self = new DuplicateModelResponse();
        return TeaModel.build(map, self);
    }

    public DuplicateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DuplicateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DuplicateModelResponse setBody(DuplicateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DuplicateModelResponseBody getBody() {
        return this.body;
    }

}
