// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUatDataListResponseBody body;

    public static GetUatDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUatDataListResponse self = new GetUatDataListResponse();
        return TeaModel.build(map, self);
    }

    public GetUatDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUatDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUatDataListResponse setBody(GetUatDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUatDataListResponseBody getBody() {
        return this.body;
    }

}
