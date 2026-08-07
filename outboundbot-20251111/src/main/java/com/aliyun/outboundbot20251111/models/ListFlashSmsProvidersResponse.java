// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListFlashSmsProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlashSmsProvidersResponseBody body;

    public static ListFlashSmsProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsProvidersResponse self = new ListFlashSmsProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlashSmsProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlashSmsProvidersResponse setBody(ListFlashSmsProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlashSmsProvidersResponseBody getBody() {
        return this.body;
    }

}
