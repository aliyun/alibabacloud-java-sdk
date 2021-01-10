// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRulebacktotestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectRulebacktotestResponseBody body;

    public static ExecHasInspectRulebacktotestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRulebacktotestResponse self = new ExecHasInspectRulebacktotestResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRulebacktotestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectRulebacktotestResponse setBody(ExecHasInspectRulebacktotestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectRulebacktotestResponseBody getBody() {
        return this.body;
    }

}
