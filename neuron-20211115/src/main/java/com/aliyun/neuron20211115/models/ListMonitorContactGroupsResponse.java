// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMonitorContactGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorContactPageResult body;

    public static ListMonitorContactGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorContactGroupsResponse self = new ListMonitorContactGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorContactGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonitorContactGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMonitorContactGroupsResponse setBody(MonitorContactPageResult body) {
        this.body = body;
        return this;
    }
    public MonitorContactPageResult getBody() {
        return this.body;
    }

}
