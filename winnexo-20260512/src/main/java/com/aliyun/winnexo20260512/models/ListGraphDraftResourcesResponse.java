// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphDraftResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGraphDraftResourcesResponseBody body;

    public static ListGraphDraftResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGraphDraftResourcesResponse self = new ListGraphDraftResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListGraphDraftResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGraphDraftResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGraphDraftResourcesResponse setBody(ListGraphDraftResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGraphDraftResourcesResponseBody getBody() {
        return this.body;
    }

}
