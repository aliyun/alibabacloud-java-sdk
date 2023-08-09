// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInternetTupleResponseBody body;

    public static GetInternetTupleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInternetTupleResponse self = new GetInternetTupleResponse();
        return TeaModel.build(map, self);
    }

    public GetInternetTupleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInternetTupleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInternetTupleResponse setBody(GetInternetTupleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInternetTupleResponseBody getBody() {
        return this.body;
    }

}
