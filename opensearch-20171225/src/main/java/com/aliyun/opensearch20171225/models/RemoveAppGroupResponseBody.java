// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppGroupResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<Integer> result;

    @NameInMap("requestId")
    public String requestId;

    public static RemoveAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppGroupResponseBody self = new RemoveAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAppGroupResponseBody setResult(java.util.List<Integer> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Integer> getResult() {
        return this.result;
    }

    public RemoveAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
