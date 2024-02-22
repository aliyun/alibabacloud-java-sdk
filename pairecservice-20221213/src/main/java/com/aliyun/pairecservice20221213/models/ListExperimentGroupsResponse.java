// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentGroupsResponseBody body;

    public static ListExperimentGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentGroupsResponse self = new ListExperimentGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentGroupsResponse setBody(ListExperimentGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentGroupsResponseBody getBody() {
        return this.body;
    }

}
