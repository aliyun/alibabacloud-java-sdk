// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskErrorLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOfflineTaskErrorLogsResponseBody body;

    public static ListOfflineTaskErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskErrorLogsResponse self = new ListOfflineTaskErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskErrorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfflineTaskErrorLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOfflineTaskErrorLogsResponse setBody(ListOfflineTaskErrorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfflineTaskErrorLogsResponseBody getBody() {
        return this.body;
    }

}
