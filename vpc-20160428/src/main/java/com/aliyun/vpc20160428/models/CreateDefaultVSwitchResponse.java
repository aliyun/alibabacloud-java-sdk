// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDefaultVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDefaultVSwitchResponseBody body;

    public static CreateDefaultVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultVSwitchResponse self = new CreateDefaultVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefaultVSwitchResponse setBody(CreateDefaultVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultVSwitchResponseBody getBody() {
        return this.body;
    }

}
