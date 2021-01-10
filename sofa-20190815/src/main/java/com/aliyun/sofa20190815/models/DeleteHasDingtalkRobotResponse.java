// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDingtalkRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDingtalkRobotResponseBody body;

    public static DeleteHasDingtalkRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDingtalkRobotResponse self = new DeleteHasDingtalkRobotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDingtalkRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDingtalkRobotResponse setBody(DeleteHasDingtalkRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDingtalkRobotResponseBody getBody() {
        return this.body;
    }

}
