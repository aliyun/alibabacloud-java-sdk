// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeMetricListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHoneypotNodeMetricListResponseBody body;

    public static GetHoneypotNodeMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeMetricListResponse self = new GetHoneypotNodeMetricListResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotNodeMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotNodeMetricListResponse setBody(GetHoneypotNodeMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotNodeMetricListResponseBody getBody() {
        return this.body;
    }

}
