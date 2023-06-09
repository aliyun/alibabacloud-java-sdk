// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>N/A</p>
     */
    @NameInMap("result")
    public java.util.List<Integer> result;

    public static RemoveScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveScheduledTaskResponseBody self = new RemoveScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveScheduledTaskResponseBody setResult(java.util.List<Integer> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Integer> getResult() {
        return this.result;
    }

}
