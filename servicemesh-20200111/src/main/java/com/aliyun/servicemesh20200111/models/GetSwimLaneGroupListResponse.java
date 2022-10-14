// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwimLaneGroupListResponseBody body;

    public static GetSwimLaneGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneGroupListResponse self = new GetSwimLaneGroupListResponse();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwimLaneGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwimLaneGroupListResponse setBody(GetSwimLaneGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwimLaneGroupListResponseBody getBody() {
        return this.body;
    }

}
