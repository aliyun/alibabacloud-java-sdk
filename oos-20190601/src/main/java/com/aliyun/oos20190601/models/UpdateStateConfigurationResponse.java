// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateStateConfigurationResponse setBody(UpdateStateConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStateConfigurationResponseBody getBody() {
        return this.body;
    }

}
