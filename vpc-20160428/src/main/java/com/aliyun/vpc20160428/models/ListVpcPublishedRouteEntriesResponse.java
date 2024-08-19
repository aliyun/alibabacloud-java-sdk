// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcPublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcPublishedRouteEntriesResponseBody body;

    public static ListVpcPublishedRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPublishedRouteEntriesResponse self = new ListVpcPublishedRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcPublishedRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcPublishedRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcPublishedRouteEntriesResponse setBody(ListVpcPublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
