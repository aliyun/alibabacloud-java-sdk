// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListParametersResponseBody body;

    public static ListParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParametersResponse self = new ListParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParametersResponse setBody(ListParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParametersResponseBody getBody() {
        return this.body;
    }

}
