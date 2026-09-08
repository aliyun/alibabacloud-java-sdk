// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataMaskingColumnsResponseBody body;

    public static ListDataMaskingColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingColumnsResponse self = new ListDataMaskingColumnsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataMaskingColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataMaskingColumnsResponse setBody(ListDataMaskingColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataMaskingColumnsResponseBody getBody() {
        return this.body;
    }

}
