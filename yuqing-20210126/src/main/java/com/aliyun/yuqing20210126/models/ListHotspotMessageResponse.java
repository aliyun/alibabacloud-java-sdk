// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListHotspotMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotspotMessageResponseBody body;

    public static ListHotspotMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotspotMessageResponse self = new ListHotspotMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListHotspotMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotspotMessageResponse setBody(ListHotspotMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotspotMessageResponseBody getBody() {
        return this.body;
    }

}
