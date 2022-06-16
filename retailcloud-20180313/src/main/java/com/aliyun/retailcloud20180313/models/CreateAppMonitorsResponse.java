// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppMonitorsResponseBody body;

    public static CreateAppMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppMonitorsResponse self = new CreateAppMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppMonitorsResponse setBody(CreateAppMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppMonitorsResponseBody getBody() {
        return this.body;
    }

}
