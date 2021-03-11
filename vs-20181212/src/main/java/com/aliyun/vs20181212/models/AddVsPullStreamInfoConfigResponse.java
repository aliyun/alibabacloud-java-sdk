// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddVsPullStreamInfoConfigResponse setBody(AddVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
