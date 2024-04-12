// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHostGroupResponseBody body;

    public static GetHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupResponse self = new GetHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHostGroupResponse setBody(GetHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostGroupResponseBody getBody() {
        return this.body;
    }

}
