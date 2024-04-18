// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationGroupResponseBody body;

    public static GetApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupResponse self = new GetApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationGroupResponse setBody(GetApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
