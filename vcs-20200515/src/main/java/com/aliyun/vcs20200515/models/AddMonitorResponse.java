// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMonitorResponseBody body;

    public static AddMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorResponse self = new AddMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMonitorResponse setBody(AddMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMonitorResponseBody getBody() {
        return this.body;
    }

}
