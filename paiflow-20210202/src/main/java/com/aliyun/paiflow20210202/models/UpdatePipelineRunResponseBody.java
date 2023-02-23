// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelineRunResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRunResponseBody self = new UpdatePipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
