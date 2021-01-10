// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveSecondRankResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("requestId")
    public String requestId;

    public static RemoveSecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSecondRankResponseBody self = new RemoveSecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSecondRankResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public RemoveSecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
