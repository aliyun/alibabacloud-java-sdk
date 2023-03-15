// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListServerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ServerInstanceResult body;

    public static ListServerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerInstancesResponse self = new ListServerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListServerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerInstancesResponse setBody(ServerInstanceResult body) {
        this.body = body;
        return this;
    }
    public ServerInstanceResult getBody() {
        return this.body;
    }

}
