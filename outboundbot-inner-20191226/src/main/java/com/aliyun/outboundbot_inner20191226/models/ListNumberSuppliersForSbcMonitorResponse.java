// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class ListNumberSuppliersForSbcMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNumberSuppliersForSbcMonitorResponseBody body;

    public static ListNumberSuppliersForSbcMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNumberSuppliersForSbcMonitorResponse self = new ListNumberSuppliersForSbcMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ListNumberSuppliersForSbcMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNumberSuppliersForSbcMonitorResponse setBody(ListNumberSuppliersForSbcMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNumberSuppliersForSbcMonitorResponseBody getBody() {
        return this.body;
    }

}
