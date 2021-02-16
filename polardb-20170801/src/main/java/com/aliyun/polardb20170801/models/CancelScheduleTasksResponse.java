// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CancelScheduleTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelScheduleTasksResponseBody body;

    public static CancelScheduleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelScheduleTasksResponse self = new CancelScheduleTasksResponse();
        return TeaModel.build(map, self);
    }

    public CancelScheduleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelScheduleTasksResponse setBody(CancelScheduleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelScheduleTasksResponseBody getBody() {
        return this.body;
    }

}
