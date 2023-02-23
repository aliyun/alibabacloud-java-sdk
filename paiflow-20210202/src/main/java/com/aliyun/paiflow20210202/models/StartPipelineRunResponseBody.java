// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class StartPipelineRunResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineRunResponseBody self = new StartPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
