// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListAccountRecordsForParentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountRecordsForParentResponseBody body;

    public static ListAccountRecordsForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountRecordsForParentResponse self = new ListAccountRecordsForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountRecordsForParentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountRecordsForParentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountRecordsForParentResponse setBody(ListAccountRecordsForParentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountRecordsForParentResponseBody getBody() {
        return this.body;
    }

}
