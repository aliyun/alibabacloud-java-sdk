// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerPortraitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHoneypotAttackerPortraitResponseBody body;

    public static ListHoneypotAttackerPortraitResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAttackerPortraitResponse self = new ListHoneypotAttackerPortraitResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAttackerPortraitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotAttackerPortraitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotAttackerPortraitResponse setBody(ListHoneypotAttackerPortraitResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotAttackerPortraitResponseBody getBody() {
        return this.body;
    }

}
