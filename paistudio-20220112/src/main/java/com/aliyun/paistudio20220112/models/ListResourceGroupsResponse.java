// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceGroupsResponseBody body;

    public static ListResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponse self = new ListResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupsResponse setBody(ListResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
