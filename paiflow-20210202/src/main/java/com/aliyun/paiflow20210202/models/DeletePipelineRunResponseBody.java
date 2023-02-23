// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class DeletePipelineRunResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineRunResponseBody self = new DeletePipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
