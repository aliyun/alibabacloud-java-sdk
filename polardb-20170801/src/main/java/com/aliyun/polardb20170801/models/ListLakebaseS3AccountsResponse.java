// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListLakebaseS3AccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLakebaseS3AccountsResponseBody body;

    public static ListLakebaseS3AccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLakebaseS3AccountsResponse self = new ListLakebaseS3AccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListLakebaseS3AccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLakebaseS3AccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLakebaseS3AccountsResponse setBody(ListLakebaseS3AccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLakebaseS3AccountsResponseBody getBody() {
        return this.body;
    }

}
