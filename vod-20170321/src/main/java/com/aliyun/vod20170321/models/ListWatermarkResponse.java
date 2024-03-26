// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWatermarkResponseBody body;

    public static ListWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkResponse self = new ListWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ListWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWatermarkResponse setBody(ListWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWatermarkResponseBody getBody() {
        return this.body;
    }

}
