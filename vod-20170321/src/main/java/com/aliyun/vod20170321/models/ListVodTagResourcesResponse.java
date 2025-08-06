// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodTagResourcesResponseBody body;

    public static ListVodTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodTagResourcesResponse self = new ListVodTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListVodTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodTagResourcesResponse setBody(ListVodTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodTagResourcesResponseBody getBody() {
        return this.body;
    }

}
