// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSavepythoncodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectSavepythoncodeResponseBody body;

    public static ExecHasInspectSavepythoncodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSavepythoncodeResponse self = new ExecHasInspectSavepythoncodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSavepythoncodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectSavepythoncodeResponse setBody(ExecHasInspectSavepythoncodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectSavepythoncodeResponseBody getBody() {
        return this.body;
    }

}
