// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRerunJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateRerunJobResponseBody body;

    public static OperateRerunJobResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateRerunJobResponse self = new OperateRerunJobResponse();
        return TeaModel.build(map, self);
    }

    public OperateRerunJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateRerunJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateRerunJobResponse setBody(OperateRerunJobResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateRerunJobResponseBody getBody() {
        return this.body;
    }

}
