// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDingtalkRobotrelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDingtalkRobotrelationResponseBody body;

    public static DeleteHasDingtalkRobotrelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDingtalkRobotrelationResponse self = new DeleteHasDingtalkRobotrelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDingtalkRobotrelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDingtalkRobotrelationResponse setBody(DeleteHasDingtalkRobotrelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDingtalkRobotrelationResponseBody getBody() {
        return this.body;
    }

}
