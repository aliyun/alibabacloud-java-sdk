// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMonitorContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorContactPageResult body;

    public static ListMonitorContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorContactsResponse self = new ListMonitorContactsResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonitorContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMonitorContactsResponse setBody(MonitorContactPageResult body) {
        this.body = body;
        return this;
    }
    public MonitorContactPageResult getBody() {
        return this.body;
    }

}
