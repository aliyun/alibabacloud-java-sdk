// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectFixreportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectFixreportResponseBody body;

    public static ExecHasInspectFixreportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectFixreportResponse self = new ExecHasInspectFixreportResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectFixreportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectFixreportResponse setBody(ExecHasInspectFixreportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectFixreportResponseBody getBody() {
        return this.body;
    }

}
