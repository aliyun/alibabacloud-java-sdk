// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSwapworkflowstatuspositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktSwapworkflowstatuspositionResponseBody body;

    public static ExecLinkeLinktSwapworkflowstatuspositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSwapworkflowstatuspositionResponse self = new ExecLinkeLinktSwapworkflowstatuspositionResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSwapworkflowstatuspositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktSwapworkflowstatuspositionResponse setBody(ExecLinkeLinktSwapworkflowstatuspositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktSwapworkflowstatuspositionResponseBody getBody() {
        return this.body;
    }

}
