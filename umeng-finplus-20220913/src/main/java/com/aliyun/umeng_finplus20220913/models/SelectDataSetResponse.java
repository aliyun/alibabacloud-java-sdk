// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SelectDataSetResponseBody body;

    public static SelectDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSetResponse self = new SelectDataSetResponse();
        return TeaModel.build(map, self);
    }

    public SelectDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectDataSetResponse setBody(SelectDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectDataSetResponseBody getBody() {
        return this.body;
    }

}
