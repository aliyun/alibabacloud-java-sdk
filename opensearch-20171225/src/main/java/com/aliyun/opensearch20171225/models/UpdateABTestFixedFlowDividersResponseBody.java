// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestFixedFlowDividersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The whitelists after the update.</p>
     */
    @NameInMap("result")
    public java.util.List<String> result;

    public static UpdateABTestFixedFlowDividersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestFixedFlowDividersResponseBody self = new UpdateABTestFixedFlowDividersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABTestFixedFlowDividersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateABTestFixedFlowDividersResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
