// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogDetailResponseBody body;

    public static GetLogDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogDetailResponse self = new GetLogDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetLogDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogDetailResponse setBody(GetLogDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogDetailResponseBody getBody() {
        return this.body;
    }

}
