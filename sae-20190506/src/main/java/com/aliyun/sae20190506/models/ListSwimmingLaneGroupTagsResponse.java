// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSwimmingLaneGroupTagsResponseBody body;

    public static ListSwimmingLaneGroupTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupTagsResponse self = new ListSwimmingLaneGroupTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwimmingLaneGroupTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSwimmingLaneGroupTagsResponse setBody(ListSwimmingLaneGroupTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwimmingLaneGroupTagsResponseBody getBody() {
        return this.body;
    }

}
