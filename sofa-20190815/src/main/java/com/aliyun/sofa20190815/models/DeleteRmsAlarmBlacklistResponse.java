// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlarmBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRmsAlarmBlacklistResponseBody body;

    public static DeleteRmsAlarmBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlarmBlacklistResponse self = new DeleteRmsAlarmBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlarmBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRmsAlarmBlacklistResponse setBody(DeleteRmsAlarmBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRmsAlarmBlacklistResponseBody getBody() {
        return this.body;
    }

}
