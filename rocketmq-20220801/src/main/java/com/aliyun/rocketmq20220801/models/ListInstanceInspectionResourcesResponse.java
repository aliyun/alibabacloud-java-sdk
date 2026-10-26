// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceInspectionResourcesResponseBody body;

    public static ListInstanceInspectionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionResourcesResponse self = new ListInstanceInspectionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceInspectionResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceInspectionResourcesResponse setBody(ListInstanceInspectionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceInspectionResourcesResponseBody getBody() {
        return this.body;
    }

}
