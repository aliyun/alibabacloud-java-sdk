// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopDeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDeployResponseBody body;

    public static StopDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDeployResponse self = new StopDeployResponse();
        return TeaModel.build(map, self);
    }

    public StopDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDeployResponse setBody(StopDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDeployResponseBody getBody() {
        return this.body;
    }

}
