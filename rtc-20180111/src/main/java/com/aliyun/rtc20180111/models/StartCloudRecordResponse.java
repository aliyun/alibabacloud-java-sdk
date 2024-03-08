// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCloudRecordResponseBody body;

    public static StartCloudRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordResponse self = new StartCloudRecordResponse();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCloudRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCloudRecordResponse setBody(StartCloudRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCloudRecordResponseBody getBody() {
        return this.body;
    }

}
