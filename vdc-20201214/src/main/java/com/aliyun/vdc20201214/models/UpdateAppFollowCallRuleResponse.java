// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppFollowCallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppFollowCallRuleResponseBody body;

    public static UpdateAppFollowCallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppFollowCallRuleResponse self = new UpdateAppFollowCallRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppFollowCallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppFollowCallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppFollowCallRuleResponse setBody(UpdateAppFollowCallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppFollowCallRuleResponseBody getBody() {
        return this.body;
    }

}
