// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSessionListResponseBody body;

    public static GetSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListResponse self = new GetSessionListResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionListResponse setBody(GetSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionListResponseBody getBody() {
        return this.body;
    }

}
