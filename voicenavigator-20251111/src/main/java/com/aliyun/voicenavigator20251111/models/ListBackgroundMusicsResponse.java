// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListBackgroundMusicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBackgroundMusicsResponseBody body;

    public static ListBackgroundMusicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackgroundMusicsResponse self = new ListBackgroundMusicsResponse();
        return TeaModel.build(map, self);
    }

    public ListBackgroundMusicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackgroundMusicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBackgroundMusicsResponse setBody(ListBackgroundMusicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackgroundMusicsResponseBody getBody() {
        return this.body;
    }

}
