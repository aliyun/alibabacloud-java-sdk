// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppFollowCallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public UpdateAppFollowCallRuleResponse setBody(UpdateAppFollowCallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppFollowCallRuleResponseBody getBody() {
        return this.body;
    }

}
