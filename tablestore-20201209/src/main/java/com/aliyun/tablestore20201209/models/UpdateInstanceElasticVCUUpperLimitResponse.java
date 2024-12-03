// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceElasticVCUUpperLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceElasticVCUUpperLimitResponseBody body;

    public static UpdateInstanceElasticVCUUpperLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceElasticVCUUpperLimitResponse self = new UpdateInstanceElasticVCUUpperLimitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceElasticVCUUpperLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceElasticVCUUpperLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceElasticVCUUpperLimitResponse setBody(UpdateInstanceElasticVCUUpperLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceElasticVCUUpperLimitResponseBody getBody() {
        return this.body;
    }

}
