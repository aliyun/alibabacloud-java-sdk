// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDynamicImageResponseBody body;

    public static ListDynamicImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageResponse self = new ListDynamicImageResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicImageResponse setBody(ListDynamicImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicImageResponseBody getBody() {
        return this.body;
    }

}
