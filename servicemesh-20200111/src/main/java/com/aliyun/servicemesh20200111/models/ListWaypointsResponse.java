// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListWaypointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWaypointsResponseBody body;

    public static ListWaypointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWaypointsResponse self = new ListWaypointsResponse();
        return TeaModel.build(map, self);
    }

    public ListWaypointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWaypointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWaypointsResponse setBody(ListWaypointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWaypointsResponseBody getBody() {
        return this.body;
    }

}
