// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagValResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagValResponseBody body;

    public static GetTagValResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagValResponse self = new GetTagValResponse();
        return TeaModel.build(map, self);
    }

    public GetTagValResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagValResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagValResponse setBody(GetTagValResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagValResponseBody getBody() {
        return this.body;
    }

}
