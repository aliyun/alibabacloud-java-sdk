// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogListResponseBody body;

    public static GetLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogListResponse self = new GetLogListResponse();
        return TeaModel.build(map, self);
    }

    public GetLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogListResponse setBody(GetLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogListResponseBody getBody() {
        return this.body;
    }

}
