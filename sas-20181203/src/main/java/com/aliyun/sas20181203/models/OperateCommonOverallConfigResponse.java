// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonOverallConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateCommonOverallConfigResponseBody body;

    public static OperateCommonOverallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonOverallConfigResponse self = new OperateCommonOverallConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateCommonOverallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateCommonOverallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateCommonOverallConfigResponse setBody(OperateCommonOverallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateCommonOverallConfigResponseBody getBody() {
        return this.body;
    }

}
