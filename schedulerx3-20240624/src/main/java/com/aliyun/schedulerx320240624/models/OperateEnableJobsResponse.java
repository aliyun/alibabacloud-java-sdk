// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateEnableJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateEnableJobsResponseBody body;

    public static OperateEnableJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateEnableJobsResponse self = new OperateEnableJobsResponse();
        return TeaModel.build(map, self);
    }

    public OperateEnableJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateEnableJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateEnableJobsResponse setBody(OperateEnableJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateEnableJobsResponseBody getBody() {
        return this.body;
    }

}
