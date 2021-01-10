// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStatisticReportResponseBody body;

    public static ListStatisticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticReportResponse self = new ListStatisticReportResponse();
        return TeaModel.build(map, self);
    }

    public ListStatisticReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatisticReportResponse setBody(ListStatisticReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatisticReportResponseBody getBody() {
        return this.body;
    }

}
