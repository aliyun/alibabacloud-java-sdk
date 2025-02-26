// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPluginsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginsInstancesResponseBody body;

    public static ListPluginsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsInstancesResponse self = new ListPluginsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginsInstancesResponse setBody(ListPluginsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginsInstancesResponseBody getBody() {
        return this.body;
    }

}
