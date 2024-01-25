// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskByNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public AiStoreUserTask data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAiStoreUserTaskByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskByNameResponseBody self = new GetAiStoreUserTaskByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskByNameResponseBody setData(AiStoreUserTask data) {
        this.data = data;
        return this;
    }
    public AiStoreUserTask getData() {
        return this.data;
    }

    public GetAiStoreUserTaskByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
