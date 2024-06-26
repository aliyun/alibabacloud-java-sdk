// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStateConfigurationResponseBody body;

    public static UpdateStateConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStateConfigurationResponse self = new UpdateStateConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStateConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStateConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStateConfigurationResponse setBody(UpdateStateConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStateConfigurationResponseBody getBody() {
        return this.body;
    }

}
