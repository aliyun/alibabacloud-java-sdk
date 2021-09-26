// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeRuleStatusResponseBody body;

    public static ChangeRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRuleStatusResponse self = new ChangeRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRuleStatusResponse setBody(ChangeRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRuleStatusResponseBody getBody() {
        return this.body;
    }

}
