// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateAppMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppMonitorsResponseBody body;

    public static UpdateAppMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMonitorsResponse self = new UpdateAppMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppMonitorsResponse setBody(UpdateAppMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppMonitorsResponseBody getBody() {
        return this.body;
    }

}
