// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNisInspectionTasksResponseBody body;

    public static ListNisInspectionTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTasksResponse self = new ListNisInspectionTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNisInspectionTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNisInspectionTasksResponse setBody(ListNisInspectionTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNisInspectionTasksResponseBody getBody() {
        return this.body;
    }

}
