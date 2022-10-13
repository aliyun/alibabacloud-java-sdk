// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListDownloadTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDownloadTasksResponseBody body;

    public static ListDownloadTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadTasksResponse self = new ListDownloadTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDownloadTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownloadTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownloadTasksResponse setBody(ListDownloadTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDownloadTasksResponseBody getBody() {
        return this.body;
    }

}
