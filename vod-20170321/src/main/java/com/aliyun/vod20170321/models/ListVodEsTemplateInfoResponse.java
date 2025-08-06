// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodEsTemplateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodEsTemplateInfoResponseBody body;

    public static ListVodEsTemplateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodEsTemplateInfoResponse self = new ListVodEsTemplateInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListVodEsTemplateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodEsTemplateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodEsTemplateInfoResponse setBody(ListVodEsTemplateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodEsTemplateInfoResponseBody getBody() {
        return this.body;
    }

}
