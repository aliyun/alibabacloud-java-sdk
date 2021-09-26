// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSessionDetailResponseBody body;

    public static GetSessionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionDetailResponse self = new GetSessionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionDetailResponse setBody(GetSessionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionDetailResponseBody getBody() {
        return this.body;
    }

}
