// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageBaselineWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateImageBaselineWhitelistResponseBody body;

    public static OperateImageBaselineWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateImageBaselineWhitelistResponse self = new OperateImageBaselineWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public OperateImageBaselineWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateImageBaselineWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateImageBaselineWhitelistResponse setBody(OperateImageBaselineWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateImageBaselineWhitelistResponseBody getBody() {
        return this.body;
    }

}
