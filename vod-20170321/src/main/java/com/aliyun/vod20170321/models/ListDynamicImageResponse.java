// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListDynamicImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicImageResponse setBody(ListDynamicImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicImageResponseBody getBody() {
        return this.body;
    }

}
