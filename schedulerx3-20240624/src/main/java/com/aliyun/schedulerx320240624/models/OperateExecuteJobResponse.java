// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateExecuteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateExecuteJobResponseBody body;

    public static OperateExecuteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateExecuteJobResponse self = new OperateExecuteJobResponse();
        return TeaModel.build(map, self);
    }

    public OperateExecuteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateExecuteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateExecuteJobResponse setBody(OperateExecuteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateExecuteJobResponseBody getBody() {
        return this.body;
    }

}
