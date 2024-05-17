// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppGroupResponseBody body;

    public static GetAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppGroupResponse self = new GetAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppGroupResponse setBody(GetAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppGroupResponseBody getBody() {
        return this.body;
    }

}
