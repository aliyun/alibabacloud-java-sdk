// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLabelTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLabelTablesResponseBody body;

    public static ListLabelTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabelTablesResponse self = new ListLabelTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListLabelTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabelTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLabelTablesResponse setBody(ListLabelTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabelTablesResponseBody getBody() {
        return this.body;
    }

}
