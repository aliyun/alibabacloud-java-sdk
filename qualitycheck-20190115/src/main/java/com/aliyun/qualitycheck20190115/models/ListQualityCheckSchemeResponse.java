// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityCheckSchemeResponseBody body;

    public static ListQualityCheckSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityCheckSchemeResponse self = new ListQualityCheckSchemeResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityCheckSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityCheckSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityCheckSchemeResponse setBody(ListQualityCheckSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

}
