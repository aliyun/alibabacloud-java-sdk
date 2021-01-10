// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDingtalkRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasDingtalkRobotResponseBody body;

    public static UpdateHasDingtalkRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDingtalkRobotResponse self = new UpdateHasDingtalkRobotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasDingtalkRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasDingtalkRobotResponse setBody(UpdateHasDingtalkRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasDingtalkRobotResponseBody getBody() {
        return this.body;
    }

}
