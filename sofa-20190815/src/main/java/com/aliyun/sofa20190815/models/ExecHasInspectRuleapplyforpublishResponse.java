// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleapplyforpublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectRuleapplyforpublishResponseBody body;

    public static ExecHasInspectRuleapplyforpublishResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleapplyforpublishResponse self = new ExecHasInspectRuleapplyforpublishResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleapplyforpublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectRuleapplyforpublishResponse setBody(ExecHasInspectRuleapplyforpublishResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectRuleapplyforpublishResponseBody getBody() {
        return this.body;
    }

}
