// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class TerminatePipelineRunResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TerminatePipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminatePipelineRunResponseBody self = new TerminatePipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminatePipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
