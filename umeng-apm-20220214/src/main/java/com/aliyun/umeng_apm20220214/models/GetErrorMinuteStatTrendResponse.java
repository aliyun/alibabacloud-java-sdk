// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetErrorMinuteStatTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErrorMinuteStatTrendResponseBody body;

    public static GetErrorMinuteStatTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErrorMinuteStatTrendResponse self = new GetErrorMinuteStatTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetErrorMinuteStatTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErrorMinuteStatTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErrorMinuteStatTrendResponse setBody(GetErrorMinuteStatTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErrorMinuteStatTrendResponseBody getBody() {
        return this.body;
    }

}
