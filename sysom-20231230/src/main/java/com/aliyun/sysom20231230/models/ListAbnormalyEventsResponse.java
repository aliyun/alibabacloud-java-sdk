// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAbnormalyEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAbnormalyEventsResponseBody body;

    public static ListAbnormalyEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAbnormalyEventsResponse self = new ListAbnormalyEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAbnormalyEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAbnormalyEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAbnormalyEventsResponse setBody(ListAbnormalyEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAbnormalyEventsResponseBody getBody() {
        return this.body;
    }

}
