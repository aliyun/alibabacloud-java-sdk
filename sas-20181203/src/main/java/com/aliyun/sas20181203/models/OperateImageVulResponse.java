// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageVulResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateImageVulResponseBody body;

    public static OperateImageVulResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateImageVulResponse self = new OperateImageVulResponse();
        return TeaModel.build(map, self);
    }

    public OperateImageVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateImageVulResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateImageVulResponse setBody(OperateImageVulResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateImageVulResponseBody getBody() {
        return this.body;
    }

}
