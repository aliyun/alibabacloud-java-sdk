// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCacheAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisTaskResponseBody self = new CreateCacheAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
