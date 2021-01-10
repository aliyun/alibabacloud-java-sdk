// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSavejavacodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectSavejavacodeResponseBody body;

    public static ExecHasInspectSavejavacodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSavejavacodeResponse self = new ExecHasInspectSavejavacodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSavejavacodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectSavejavacodeResponse setBody(ExecHasInspectSavejavacodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectSavejavacodeResponseBody getBody() {
        return this.body;
    }

}
