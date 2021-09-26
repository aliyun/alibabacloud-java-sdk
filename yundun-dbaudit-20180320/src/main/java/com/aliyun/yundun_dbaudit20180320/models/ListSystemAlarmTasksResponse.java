// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemAlarmTasksResponseBody body;

    public static ListSystemAlarmTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAlarmTasksResponse self = new ListSystemAlarmTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemAlarmTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemAlarmTasksResponse setBody(ListSystemAlarmTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemAlarmTasksResponseBody getBody() {
        return this.body;
    }

}
