// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetTodayStatTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTodayStatTrendResponseBody body;

    public static GetTodayStatTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTodayStatTrendResponse self = new GetTodayStatTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetTodayStatTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTodayStatTrendResponse setBody(GetTodayStatTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTodayStatTrendResponseBody getBody() {
        return this.body;
    }

}
