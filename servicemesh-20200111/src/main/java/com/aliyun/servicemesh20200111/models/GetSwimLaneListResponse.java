// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwimLaneListResponseBody body;

    public static GetSwimLaneListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListResponse self = new GetSwimLaneListResponse();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwimLaneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwimLaneListResponse setBody(GetSwimLaneListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwimLaneListResponseBody getBody() {
        return this.body;
    }

}
