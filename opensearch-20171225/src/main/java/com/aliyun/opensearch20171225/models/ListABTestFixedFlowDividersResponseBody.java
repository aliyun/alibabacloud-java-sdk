// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestFixedFlowDividersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The queried whitelists.</p>
     */
    @NameInMap("result")
    public java.util.List<String> result;

    public static ListABTestFixedFlowDividersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestFixedFlowDividersResponseBody self = new ListABTestFixedFlowDividersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestFixedFlowDividersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestFixedFlowDividersResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
