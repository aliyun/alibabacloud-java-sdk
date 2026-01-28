// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateConnectDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateConnectDatasourceResponseBody body;

    public static OperateConnectDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateConnectDatasourceResponse self = new OperateConnectDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public OperateConnectDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateConnectDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateConnectDatasourceResponse setBody(OperateConnectDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateConnectDatasourceResponseBody getBody() {
        return this.body;
    }

}
