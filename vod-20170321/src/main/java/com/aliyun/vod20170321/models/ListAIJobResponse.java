// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIJobResponseBody body;

    public static ListAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIJobResponse self = new ListAIJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIJobResponse setBody(ListAIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIJobResponseBody getBody() {
        return this.body;
    }

}
