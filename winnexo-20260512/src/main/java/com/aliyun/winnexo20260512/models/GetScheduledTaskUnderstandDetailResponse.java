// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskUnderstandDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledTaskUnderstandDetailResponseBody body;

    public static GetScheduledTaskUnderstandDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskUnderstandDetailResponse self = new GetScheduledTaskUnderstandDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskUnderstandDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledTaskUnderstandDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledTaskUnderstandDetailResponse setBody(GetScheduledTaskUnderstandDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledTaskUnderstandDetailResponseBody getBody() {
        return this.body;
    }

}
