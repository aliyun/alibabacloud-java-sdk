// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentVersionsResponseBody body;

    public static ListExperimentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentVersionsResponse self = new ListExperimentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentVersionsResponse setBody(ListExperimentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentVersionsResponseBody getBody() {
        return this.body;
    }

}
