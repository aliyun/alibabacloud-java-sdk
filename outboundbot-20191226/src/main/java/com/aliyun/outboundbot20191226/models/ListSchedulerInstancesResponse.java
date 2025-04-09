// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListSchedulerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSchedulerInstancesResponseBody body;

    public static ListSchedulerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulerInstancesResponse self = new ListSchedulerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListSchedulerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSchedulerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSchedulerInstancesResponse setBody(ListSchedulerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSchedulerInstancesResponseBody getBody() {
        return this.body;
    }

}
