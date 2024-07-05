// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVsPullStreamInfoConfigResponseBody body;

    public static AddVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVsPullStreamInfoConfigResponse self = new AddVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVsPullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVsPullStreamInfoConfigResponse setBody(AddVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
