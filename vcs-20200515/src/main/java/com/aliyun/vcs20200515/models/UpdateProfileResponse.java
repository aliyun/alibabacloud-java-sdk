// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProfileResponseBody body;

    public static UpdateProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileResponse self = new UpdateProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProfileResponse setBody(UpdateProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProfileResponseBody getBody() {
        return this.body;
    }

}
