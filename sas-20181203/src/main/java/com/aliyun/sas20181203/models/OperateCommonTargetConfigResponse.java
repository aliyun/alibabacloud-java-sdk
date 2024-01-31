// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateCommonTargetConfigResponseBody body;

    public static OperateCommonTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonTargetConfigResponse self = new OperateCommonTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateCommonTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateCommonTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateCommonTargetConfigResponse setBody(OperateCommonTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateCommonTargetConfigResponseBody getBody() {
        return this.body;
    }

}
