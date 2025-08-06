// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CheckVodDefaultRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckVodDefaultRoleResponseBody body;

    public static CheckVodDefaultRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVodDefaultRoleResponse self = new CheckVodDefaultRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckVodDefaultRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVodDefaultRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckVodDefaultRoleResponse setBody(CheckVodDefaultRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVodDefaultRoleResponseBody getBody() {
        return this.body;
    }

}
