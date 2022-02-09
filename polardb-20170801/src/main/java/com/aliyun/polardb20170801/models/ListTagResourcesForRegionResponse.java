// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesForRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTagResourcesForRegionResponse setBody(ListTagResourcesForRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagResourcesForRegionResponseBody getBody() {
        return this.body;
    }

}
