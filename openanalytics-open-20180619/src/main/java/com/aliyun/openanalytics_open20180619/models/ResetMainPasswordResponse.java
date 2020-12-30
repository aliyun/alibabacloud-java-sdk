// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ResetMainPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetMainPasswordResponseBody body;

    public static ResetMainPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetMainPasswordResponse self = new ResetMainPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetMainPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetMainPasswordResponse setBody(ResetMainPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetMainPasswordResponseBody getBody() {
        return this.body;
    }

}
