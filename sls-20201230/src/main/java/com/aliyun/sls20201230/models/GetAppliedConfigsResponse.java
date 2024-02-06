// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAppliedConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppliedConfigsResponseBody body;

    public static GetAppliedConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedConfigsResponse self = new GetAppliedConfigsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppliedConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppliedConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppliedConfigsResponse setBody(GetAppliedConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppliedConfigsResponseBody getBody() {
        return this.body;
    }

}
