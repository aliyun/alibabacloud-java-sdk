// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCloudNoteResponseBody body;

    public static StartCloudNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCloudNoteResponse self = new StartCloudNoteResponse();
        return TeaModel.build(map, self);
    }

    public StartCloudNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCloudNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCloudNoteResponse setBody(StartCloudNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCloudNoteResponseBody getBody() {
        return this.body;
    }

}
