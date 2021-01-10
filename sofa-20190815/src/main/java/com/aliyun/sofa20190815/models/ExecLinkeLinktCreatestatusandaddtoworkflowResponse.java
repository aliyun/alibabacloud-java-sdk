// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandaddtoworkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody body;

    public static ExecLinkeLinktCreatestatusandaddtoworkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandaddtoworkflowResponse self = new ExecLinkeLinktCreatestatusandaddtoworkflowResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponse setBody(ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody getBody() {
        return this.body;
    }

}
