// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoTagJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoTagJobResponseBody body;

    public static ListAIVideoTagJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTagJobResponse self = new ListAIVideoTagJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoTagJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoTagJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoTagJobResponse setBody(ListAIVideoTagJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoTagJobResponseBody getBody() {
        return this.body;
    }

}
