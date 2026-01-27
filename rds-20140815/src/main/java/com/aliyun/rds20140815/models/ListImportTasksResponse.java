// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListImportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImportTasksResponseBody body;

    public static ListImportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImportTasksResponse self = new ListImportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListImportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImportTasksResponse setBody(ListImportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImportTasksResponseBody getBody() {
        return this.body;
    }

}
