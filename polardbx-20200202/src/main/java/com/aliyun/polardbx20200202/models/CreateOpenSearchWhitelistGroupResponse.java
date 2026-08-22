// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenSearchWhitelistGroupResponseBody body;

    public static CreateOpenSearchWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchWhitelistGroupResponse self = new CreateOpenSearchWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSearchWhitelistGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenSearchWhitelistGroupResponse setBody(CreateOpenSearchWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSearchWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
