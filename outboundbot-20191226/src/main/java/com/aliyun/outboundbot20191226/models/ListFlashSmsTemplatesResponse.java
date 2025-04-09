// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlashSmsTemplatesResponseBody body;

    public static ListFlashSmsTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesResponse self = new ListFlashSmsTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlashSmsTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlashSmsTemplatesResponse setBody(ListFlashSmsTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlashSmsTemplatesResponseBody getBody() {
        return this.body;
    }

}
