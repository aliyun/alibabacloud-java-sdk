// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleapplyforupdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectRuleapplyforupdateResponseBody body;

    public static ExecHasInspectRuleapplyforupdateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleapplyforupdateResponse self = new ExecHasInspectRuleapplyforupdateResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleapplyforupdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectRuleapplyforupdateResponse setBody(ExecHasInspectRuleapplyforupdateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectRuleapplyforupdateResponseBody getBody() {
        return this.body;
    }

}
