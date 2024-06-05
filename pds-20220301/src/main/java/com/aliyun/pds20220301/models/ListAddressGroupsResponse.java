// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAddressGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddressGroupsResponseBody body;

    public static ListAddressGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddressGroupsResponse self = new ListAddressGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAddressGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddressGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddressGroupsResponse setBody(ListAddressGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddressGroupsResponseBody getBody() {
        return this.body;
    }

}
