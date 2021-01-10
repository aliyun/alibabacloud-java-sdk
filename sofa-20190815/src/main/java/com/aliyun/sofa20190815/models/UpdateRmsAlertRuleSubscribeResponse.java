// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertRuleSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRmsAlertRuleSubscribeResponseBody body;

    public static UpdateRmsAlertRuleSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertRuleSubscribeResponse self = new UpdateRmsAlertRuleSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertRuleSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRmsAlertRuleSubscribeResponse setBody(UpdateRmsAlertRuleSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRmsAlertRuleSubscribeResponseBody getBody() {
        return this.body;
    }

}
