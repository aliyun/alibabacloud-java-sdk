// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RoamClientUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RoamClientUserResponseBody body;

    public static RoamClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RoamClientUserResponse self = new RoamClientUserResponse();
        return TeaModel.build(map, self);
    }

    public RoamClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RoamClientUserResponse setBody(RoamClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RoamClientUserResponseBody getBody() {
        return this.body;
    }

}
