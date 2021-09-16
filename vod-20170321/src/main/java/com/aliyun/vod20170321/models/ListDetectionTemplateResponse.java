// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDetectionTemplateResponseBody body;

    public static ListDetectionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionTemplateResponse self = new ListDetectionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectionTemplateResponse setBody(ListDetectionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectionTemplateResponseBody getBody() {
        return this.body;
    }

}
