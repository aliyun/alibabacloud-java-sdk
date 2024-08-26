// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTaskReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNisInspectionTaskReportsResponseBody body;

    public static ListNisInspectionTaskReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTaskReportsResponse self = new ListNisInspectionTaskReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTaskReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNisInspectionTaskReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNisInspectionTaskReportsResponse setBody(ListNisInspectionTaskReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNisInspectionTaskReportsResponseBody getBody() {
        return this.body;
    }

}
