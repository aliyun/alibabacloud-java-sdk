// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListProductEnvInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnvListResult body;

    public static ListProductEnvInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvInfosResponse self = new ListProductEnvInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListProductEnvInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductEnvInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductEnvInfosResponse setBody(EnvListResult body) {
        this.body = body;
        return this;
    }
    public EnvListResult getBody() {
        return this.body;
    }

}
