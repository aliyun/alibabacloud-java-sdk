// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelDeleteResponseBody body;

    public static ModelDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelDeleteResponse self = new ModelDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ModelDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelDeleteResponse setBody(ModelDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelDeleteResponseBody getBody() {
        return this.body;
    }

}
