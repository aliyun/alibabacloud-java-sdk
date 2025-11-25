// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMultiUserInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultiUserInstancesResponseBody body;

    public static ListMultiUserInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiUserInstancesResponse self = new ListMultiUserInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiUserInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiUserInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiUserInstancesResponse setBody(ListMultiUserInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiUserInstancesResponseBody getBody() {
        return this.body;
    }

}
