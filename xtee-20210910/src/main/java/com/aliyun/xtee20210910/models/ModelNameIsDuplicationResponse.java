// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelNameIsDuplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelNameIsDuplicationResponseBody body;

    public static ModelNameIsDuplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelNameIsDuplicationResponse self = new ModelNameIsDuplicationResponse();
        return TeaModel.build(map, self);
    }

    public ModelNameIsDuplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelNameIsDuplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelNameIsDuplicationResponse setBody(ModelNameIsDuplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelNameIsDuplicationResponseBody getBody() {
        return this.body;
    }

}
