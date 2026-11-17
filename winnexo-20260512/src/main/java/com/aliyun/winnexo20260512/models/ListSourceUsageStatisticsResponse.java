// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSourceUsageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSourceUsageStatisticsResponseBody body;

    public static ListSourceUsageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceUsageStatisticsResponse self = new ListSourceUsageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceUsageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourceUsageStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSourceUsageStatisticsResponse setBody(ListSourceUsageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourceUsageStatisticsResponseBody getBody() {
        return this.body;
    }

}
