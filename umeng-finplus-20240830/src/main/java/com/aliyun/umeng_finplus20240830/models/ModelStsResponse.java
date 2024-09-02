// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ModelStsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelStsResponseBody body;

    public static ModelStsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelStsResponse self = new ModelStsResponse();
        return TeaModel.build(map, self);
    }

    public ModelStsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelStsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelStsResponse setBody(ModelStsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelStsResponseBody getBody() {
        return this.body;
    }

}
