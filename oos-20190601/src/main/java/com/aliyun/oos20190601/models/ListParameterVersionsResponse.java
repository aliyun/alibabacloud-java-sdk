// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParameterVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListParameterVersionsResponseBody body;

    public static ListParameterVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsResponse self = new ListParameterVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParameterVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParameterVersionsResponse setBody(ListParameterVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParameterVersionsResponseBody getBody() {
        return this.body;
    }

}
