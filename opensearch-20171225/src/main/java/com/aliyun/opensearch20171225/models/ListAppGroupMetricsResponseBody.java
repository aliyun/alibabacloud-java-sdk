// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListAppGroupMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupMetricsResponseBody self = new ListAppGroupMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupMetricsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
