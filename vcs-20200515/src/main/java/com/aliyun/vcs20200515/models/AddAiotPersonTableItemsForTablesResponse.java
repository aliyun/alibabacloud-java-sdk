// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsForTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAiotPersonTableItemsForTablesResponseBody body;

    public static AddAiotPersonTableItemsForTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsForTablesResponse self = new AddAiotPersonTableItemsForTablesResponse();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsForTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAiotPersonTableItemsForTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAiotPersonTableItemsForTablesResponse setBody(AddAiotPersonTableItemsForTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAiotPersonTableItemsForTablesResponseBody getBody() {
        return this.body;
    }

}
