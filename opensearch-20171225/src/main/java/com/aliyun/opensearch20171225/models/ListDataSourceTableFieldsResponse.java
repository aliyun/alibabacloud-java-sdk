// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTableFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSourceTableFieldsResponseBody body;

    public static ListDataSourceTableFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTableFieldsResponse self = new ListDataSourceTableFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTableFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceTableFieldsResponse setBody(ListDataSourceTableFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceTableFieldsResponseBody getBody() {
        return this.body;
    }

}
