// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestSceneResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DeleteABTestSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestSceneResponseBody self = new DeleteABTestSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteABTestSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteABTestSceneResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
