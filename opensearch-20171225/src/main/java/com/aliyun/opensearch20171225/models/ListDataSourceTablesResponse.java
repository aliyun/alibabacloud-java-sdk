// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSourceTablesResponseBody body;

    public static ListDataSourceTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTablesResponse self = new ListDataSourceTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceTablesResponse setBody(ListDataSourceTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceTablesResponseBody getBody() {
        return this.body;
    }

}
