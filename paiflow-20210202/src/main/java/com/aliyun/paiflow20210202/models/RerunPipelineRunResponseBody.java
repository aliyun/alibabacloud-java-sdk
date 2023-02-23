// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class RerunPipelineRunResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RerunPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunPipelineRunResponseBody self = new RerunPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
