// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLTrajectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRLTrajectoryResponseBody body;

    public static GetRLTrajectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRLTrajectoryResponse self = new GetRLTrajectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetRLTrajectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRLTrajectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRLTrajectoryResponse setBody(GetRLTrajectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRLTrajectoryResponseBody getBody() {
        return this.body;
    }

}
