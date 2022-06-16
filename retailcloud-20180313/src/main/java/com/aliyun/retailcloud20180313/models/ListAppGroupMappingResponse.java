// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppGroupMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppGroupMappingResponseBody body;

    public static ListAppGroupMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupMappingResponse self = new ListAppGroupMappingResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppGroupMappingResponse setBody(ListAppGroupMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupMappingResponseBody getBody() {
        return this.body;
    }

}
