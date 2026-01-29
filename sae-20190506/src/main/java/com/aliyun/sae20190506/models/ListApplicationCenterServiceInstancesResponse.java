// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationCenterServiceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationCenterServiceInstancesResponseBody body;

    public static ListApplicationCenterServiceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCenterServiceInstancesResponse self = new ListApplicationCenterServiceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationCenterServiceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationCenterServiceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationCenterServiceInstancesResponse setBody(ListApplicationCenterServiceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationCenterServiceInstancesResponseBody getBody() {
        return this.body;
    }

}
