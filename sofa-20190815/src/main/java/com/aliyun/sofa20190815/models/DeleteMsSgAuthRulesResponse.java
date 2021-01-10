// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgAuthRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgAuthRulesResponseBody body;

    public static DeleteMsSgAuthRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgAuthRulesResponse self = new DeleteMsSgAuthRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgAuthRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgAuthRulesResponse setBody(DeleteMsSgAuthRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgAuthRulesResponseBody getBody() {
        return this.body;
    }

}
