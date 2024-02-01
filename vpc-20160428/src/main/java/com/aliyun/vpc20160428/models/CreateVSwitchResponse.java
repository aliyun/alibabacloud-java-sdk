// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVSwitchResponseBody body;

    public static CreateVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponse self = new CreateVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVSwitchResponse setBody(CreateVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVSwitchResponseBody getBody() {
        return this.body;
    }

}
