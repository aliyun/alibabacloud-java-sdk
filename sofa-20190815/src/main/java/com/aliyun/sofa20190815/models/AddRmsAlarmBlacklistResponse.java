// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlarmBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRmsAlarmBlacklistResponseBody body;

    public static AddRmsAlarmBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlarmBlacklistResponse self = new AddRmsAlarmBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddRmsAlarmBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRmsAlarmBlacklistResponse setBody(AddRmsAlarmBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRmsAlarmBlacklistResponseBody getBody() {
        return this.body;
    }

}
