// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AiStoreUserTask data;

    public static GetAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskResponseBody self = new GetAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiStoreUserTaskResponseBody setData(AiStoreUserTask data) {
        this.data = data;
        return this;
    }
    public AiStoreUserTask getData() {
        return this.data;
    }

}
