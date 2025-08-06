// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditAppInfoResponseBody body;

    public static EditAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        EditAppInfoResponse self = new EditAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public EditAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditAppInfoResponse setBody(EditAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public EditAppInfoResponseBody getBody() {
        return this.body;
    }

}
