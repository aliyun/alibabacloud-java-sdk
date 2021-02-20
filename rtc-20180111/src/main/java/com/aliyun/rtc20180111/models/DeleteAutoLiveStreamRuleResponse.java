// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAutoLiveStreamRuleResponseBody body;

    public static DeleteAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoLiveStreamRuleResponse self = new DeleteAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoLiveStreamRuleResponse setBody(DeleteAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
