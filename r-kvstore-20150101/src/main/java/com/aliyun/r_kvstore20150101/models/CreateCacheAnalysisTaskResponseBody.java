// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC1E3D6-7C88-4DF5-9A3D-0DB1E6D9****</p>
     */
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
