// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataSetResponseBody body;

    public static CreateDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSetResponse self = new CreateDataSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataSetResponse setBody(CreateDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSetResponseBody getBody() {
        return this.body;
    }

}
