// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceAttributeResponseBody body;

    public static ListDataSourceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceAttributeResponse self = new ListDataSourceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceAttributeResponse setBody(ListDataSourceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceAttributeResponseBody getBody() {
        return this.body;
    }

}
