// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsWithAuthDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceGroupsWithAuthDetailsResponseBody body;

    public static ListResourceGroupsWithAuthDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsWithAuthDetailsResponse self = new ListResourceGroupsWithAuthDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsWithAuthDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupsWithAuthDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupsWithAuthDetailsResponse setBody(ListResourceGroupsWithAuthDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupsWithAuthDetailsResponseBody getBody() {
        return this.body;
    }

}
