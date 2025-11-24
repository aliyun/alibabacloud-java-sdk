// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSwimLaneDetailResponseBody body;

    public static GetSwimLaneDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneDetailResponse self = new GetSwimLaneDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwimLaneDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwimLaneDetailResponse setBody(GetSwimLaneDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwimLaneDetailResponseBody getBody() {
        return this.body;
    }

}
