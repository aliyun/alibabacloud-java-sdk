// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertrulePauseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRmsAlertrulePauseResponseBody body;

    public static UpdateRmsAlertrulePauseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertrulePauseResponse self = new UpdateRmsAlertrulePauseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertrulePauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRmsAlertrulePauseResponse setBody(UpdateRmsAlertrulePauseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRmsAlertrulePauseResponseBody getBody() {
        return this.body;
    }

}
