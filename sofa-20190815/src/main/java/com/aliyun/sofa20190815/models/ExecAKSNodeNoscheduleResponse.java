// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSNodeNoscheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecAKSNodeNoscheduleResponseBody body;

    public static ExecAKSNodeNoscheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSNodeNoscheduleResponse self = new ExecAKSNodeNoscheduleResponse();
        return TeaModel.build(map, self);
    }

    public ExecAKSNodeNoscheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecAKSNodeNoscheduleResponse setBody(ExecAKSNodeNoscheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecAKSNodeNoscheduleResponseBody getBody() {
        return this.body;
    }

}
