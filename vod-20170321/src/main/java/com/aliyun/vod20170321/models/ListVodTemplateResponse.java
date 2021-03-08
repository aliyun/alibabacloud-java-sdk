// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVodTemplateResponseBody body;

    public static ListVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateResponse self = new ListVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodTemplateResponse setBody(ListVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodTemplateResponseBody getBody() {
        return this.body;
    }

}
