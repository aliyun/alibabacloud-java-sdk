// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAgentStatusResponseBody body;

    public static ChangeAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgentStatusResponse self = new ChangeAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAgentStatusResponse setBody(ChangeAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAgentStatusResponseBody getBody() {
        return this.body;
    }

}
