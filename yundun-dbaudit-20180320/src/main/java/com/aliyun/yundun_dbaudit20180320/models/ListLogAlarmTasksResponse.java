// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListLogAlarmTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogAlarmTasksResponseBody body;

    public static ListLogAlarmTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogAlarmTasksResponse self = new ListLogAlarmTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListLogAlarmTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogAlarmTasksResponse setBody(ListLogAlarmTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogAlarmTasksResponseBody getBody() {
        return this.body;
    }

}
