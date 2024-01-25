// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class UpdateAiStoreUserTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiStoreUserTaskResponseBody self = new UpdateAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiStoreUserTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
