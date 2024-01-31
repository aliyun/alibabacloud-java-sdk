// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionTargetPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterceptionTargetPageResponseBody body;

    public static ListInterceptionTargetPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionTargetPageResponse self = new ListInterceptionTargetPageResponse();
        return TeaModel.build(map, self);
    }

    public ListInterceptionTargetPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterceptionTargetPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterceptionTargetPageResponse setBody(ListInterceptionTargetPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterceptionTargetPageResponseBody getBody() {
        return this.body;
    }

}
