// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class FindSvcMapBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindSvcMapBindResponseBody body;

    public static FindSvcMapBindResponse build(java.util.Map<String, ?> map) throws Exception {
        FindSvcMapBindResponse self = new FindSvcMapBindResponse();
        return TeaModel.build(map, self);
    }

    public FindSvcMapBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindSvcMapBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindSvcMapBindResponse setBody(FindSvcMapBindResponseBody body) {
        this.body = body;
        return this;
    }
    public FindSvcMapBindResponseBody getBody() {
        return this.body;
    }

}
