// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetWordGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWordGroupResponseBody body;

    public static GetWordGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWordGroupResponse self = new GetWordGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetWordGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWordGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWordGroupResponse setBody(GetWordGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWordGroupResponseBody getBody() {
        return this.body;
    }

}
