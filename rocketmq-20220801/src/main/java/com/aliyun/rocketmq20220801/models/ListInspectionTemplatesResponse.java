// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInspectionTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInspectionTemplatesResponseBody body;

    public static ListInspectionTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTemplatesResponse self = new ListInspectionTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListInspectionTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInspectionTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInspectionTemplatesResponse setBody(ListInspectionTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInspectionTemplatesResponseBody getBody() {
        return this.body;
    }

}
