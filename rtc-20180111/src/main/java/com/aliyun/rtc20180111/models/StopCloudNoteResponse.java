// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopCloudNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCloudNoteResponseBody body;

    public static StopCloudNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCloudNoteResponse self = new StopCloudNoteResponse();
        return TeaModel.build(map, self);
    }

    public StopCloudNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCloudNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCloudNoteResponse setBody(StopCloudNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCloudNoteResponseBody getBody() {
        return this.body;
    }

}
