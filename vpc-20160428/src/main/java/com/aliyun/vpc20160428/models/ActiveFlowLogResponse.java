// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveFlowLogResponseBody body;

    public static ActiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponse self = new ActiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public ActiveFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveFlowLogResponse setBody(ActiveFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveFlowLogResponseBody getBody() {
        return this.body;
    }

}
