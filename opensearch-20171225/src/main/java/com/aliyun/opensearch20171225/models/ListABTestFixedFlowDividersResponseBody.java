// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestFixedFlowDividersResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<String> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListABTestFixedFlowDividersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestFixedFlowDividersResponseBody self = new ListABTestFixedFlowDividersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestFixedFlowDividersResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public ListABTestFixedFlowDividersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
