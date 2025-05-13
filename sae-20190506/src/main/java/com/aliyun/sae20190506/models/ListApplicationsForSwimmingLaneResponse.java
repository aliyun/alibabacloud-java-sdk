// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsForSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForSwimmingLaneResponseBody body;

    public static ListApplicationsForSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForSwimmingLaneResponse self = new ListApplicationsForSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForSwimmingLaneResponse setBody(ListApplicationsForSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
