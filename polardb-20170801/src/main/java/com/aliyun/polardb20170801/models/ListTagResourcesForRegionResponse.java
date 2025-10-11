// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesForRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagResourcesForRegionResponseBody body;

    public static ListTagResourcesForRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesForRegionResponse self = new ListTagResourcesForRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesForRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagResourcesForRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagResourcesForRegionResponse setBody(ListTagResourcesForRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagResourcesForRegionResponseBody getBody() {
        return this.body;
    }

}
