// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SetAllowIPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAllowIPResponseBody body;

    public static SetAllowIPResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAllowIPResponse self = new SetAllowIPResponse();
        return TeaModel.build(map, self);
    }

    public SetAllowIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAllowIPResponse setBody(SetAllowIPResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAllowIPResponseBody getBody() {
        return this.body;
    }

}
