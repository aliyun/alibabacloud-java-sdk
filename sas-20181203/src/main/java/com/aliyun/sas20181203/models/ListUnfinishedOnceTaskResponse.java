// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnfinishedOnceTaskResponseBody body;

    public static ListUnfinishedOnceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnfinishedOnceTaskResponse self = new ListUnfinishedOnceTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListUnfinishedOnceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnfinishedOnceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnfinishedOnceTaskResponse setBody(ListUnfinishedOnceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnfinishedOnceTaskResponseBody getBody() {
        return this.body;
    }

}
