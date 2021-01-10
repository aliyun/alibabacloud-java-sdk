// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveDataCollectionResponseBody extends TeaModel {
    @NameInMap("result")
    public String result;

    @NameInMap("requestId")
    public String requestId;

    public static RemoveDataCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataCollectionResponseBody self = new RemoveDataCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDataCollectionResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public RemoveDataCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
