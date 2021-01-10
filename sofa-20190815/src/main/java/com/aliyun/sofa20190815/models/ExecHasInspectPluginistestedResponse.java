// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginistestedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectPluginistestedResponseBody body;

    public static ExecHasInspectPluginistestedResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginistestedResponse self = new ExecHasInspectPluginistestedResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginistestedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectPluginistestedResponse setBody(ExecHasInspectPluginistestedResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectPluginistestedResponseBody getBody() {
        return this.body;
    }

}
