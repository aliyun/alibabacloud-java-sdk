// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductDimensionGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductDimensionGroupsResponseBody body;

    public static ListProductDimensionGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductDimensionGroupsResponse self = new ListProductDimensionGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductDimensionGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductDimensionGroupsResponse setBody(ListProductDimensionGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductDimensionGroupsResponseBody getBody() {
        return this.body;
    }

}
