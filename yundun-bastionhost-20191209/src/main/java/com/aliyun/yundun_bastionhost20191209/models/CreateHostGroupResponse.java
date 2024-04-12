// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHostGroupResponseBody body;

    public static CreateHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostGroupResponse self = new CreateHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHostGroupResponse setBody(CreateHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostGroupResponseBody getBody() {
        return this.body;
    }

}
