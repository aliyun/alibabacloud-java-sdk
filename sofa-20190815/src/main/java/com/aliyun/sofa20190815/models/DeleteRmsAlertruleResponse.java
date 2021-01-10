// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlertruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRmsAlertruleResponseBody body;

    public static DeleteRmsAlertruleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlertruleResponse self = new DeleteRmsAlertruleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlertruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRmsAlertruleResponse setBody(DeleteRmsAlertruleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRmsAlertruleResponseBody getBody() {
        return this.body;
    }

}
