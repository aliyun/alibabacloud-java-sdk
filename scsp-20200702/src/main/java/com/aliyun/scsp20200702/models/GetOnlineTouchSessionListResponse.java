// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOnlineTouchSessionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOnlineTouchSessionListResponseBody body;

    public static GetOnlineTouchSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineTouchSessionListResponse self = new GetOnlineTouchSessionListResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineTouchSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineTouchSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnlineTouchSessionListResponse setBody(GetOnlineTouchSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineTouchSessionListResponseBody getBody() {
        return this.body;
    }

}
