// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class StartCallV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartCallV2ResponseBody body;

    public static StartCallV2Response build(java.util.Map<String, ?> map) throws Exception {
        StartCallV2Response self = new StartCallV2Response();
        return TeaModel.build(map, self);
    }

    public StartCallV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCallV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCallV2Response setBody(StartCallV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCallV2ResponseBody getBody() {
        return this.body;
    }

}
