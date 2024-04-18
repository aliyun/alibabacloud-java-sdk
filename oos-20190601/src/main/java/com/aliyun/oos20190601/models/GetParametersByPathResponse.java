// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersByPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParametersByPathResponseBody body;

    public static GetParametersByPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersByPathResponse self = new GetParametersByPathResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersByPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersByPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParametersByPathResponse setBody(GetParametersByPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersByPathResponseBody getBody() {
        return this.body;
    }

}
