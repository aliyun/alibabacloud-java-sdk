// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpdateAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountPasswordResponseBody body;

    public static UpdateAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountPasswordResponse self = new UpdateAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountPasswordResponse setBody(UpdateAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
