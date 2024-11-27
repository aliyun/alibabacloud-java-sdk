// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDesignateExecutorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateDesignateExecutorsResponseBody body;

    public static OperateDesignateExecutorsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateDesignateExecutorsResponse self = new OperateDesignateExecutorsResponse();
        return TeaModel.build(map, self);
    }

    public OperateDesignateExecutorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateDesignateExecutorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateDesignateExecutorsResponse setBody(OperateDesignateExecutorsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateDesignateExecutorsResponseBody getBody() {
        return this.body;
    }

}
