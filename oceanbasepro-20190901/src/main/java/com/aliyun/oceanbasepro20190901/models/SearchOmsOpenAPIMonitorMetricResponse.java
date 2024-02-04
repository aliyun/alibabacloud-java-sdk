// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchOmsOpenAPIMonitorMetricResponseBody body;

    public static SearchOmsOpenAPIMonitorMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIMonitorMetricResponse self = new SearchOmsOpenAPIMonitorMetricResponse();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIMonitorMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchOmsOpenAPIMonitorMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchOmsOpenAPIMonitorMetricResponse setBody(SearchOmsOpenAPIMonitorMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchOmsOpenAPIMonitorMetricResponseBody getBody() {
        return this.body;
    }

}
