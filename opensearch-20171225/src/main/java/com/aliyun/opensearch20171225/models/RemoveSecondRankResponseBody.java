// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveSecondRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>N/A</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static RemoveSecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSecondRankResponseBody self = new RemoveSecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveSecondRankResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
