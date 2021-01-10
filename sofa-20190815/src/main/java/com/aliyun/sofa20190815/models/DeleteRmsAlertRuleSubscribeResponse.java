// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlertRuleSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRmsAlertRuleSubscribeResponseBody body;

    public static DeleteRmsAlertRuleSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlertRuleSubscribeResponse self = new DeleteRmsAlertRuleSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlertRuleSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRmsAlertRuleSubscribeResponse setBody(DeleteRmsAlertRuleSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRmsAlertRuleSubscribeResponseBody getBody() {
        return this.body;
    }

}
