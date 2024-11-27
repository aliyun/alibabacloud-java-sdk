// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDisableJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateDisableJobsResponseBody body;

    public static OperateDisableJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateDisableJobsResponse self = new OperateDisableJobsResponse();
        return TeaModel.build(map, self);
    }

    public OperateDisableJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateDisableJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateDisableJobsResponse setBody(OperateDisableJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateDisableJobsResponseBody getBody() {
        return this.body;
    }

}
