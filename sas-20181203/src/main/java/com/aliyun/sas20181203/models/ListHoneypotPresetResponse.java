// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotPresetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotPresetResponseBody body;

    public static ListHoneypotPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotPresetResponse self = new ListHoneypotPresetResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotPresetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotPresetResponse setBody(ListHoneypotPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotPresetResponseBody getBody() {
        return this.body;
    }

}
