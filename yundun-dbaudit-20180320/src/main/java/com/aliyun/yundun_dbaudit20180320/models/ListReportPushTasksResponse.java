// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListReportPushTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListReportPushTasksResponseBody body;

    public static ListReportPushTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportPushTasksResponse self = new ListReportPushTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListReportPushTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReportPushTasksResponse setBody(ListReportPushTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReportPushTasksResponseBody getBody() {
        return this.body;
    }

}
