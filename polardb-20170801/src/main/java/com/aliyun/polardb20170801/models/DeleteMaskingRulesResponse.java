// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteMaskingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMaskingRulesResponseBody body;

    public static DeleteMaskingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaskingRulesResponse self = new DeleteMaskingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaskingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaskingRulesResponse setBody(DeleteMaskingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaskingRulesResponseBody getBody() {
        return this.body;
    }

}
