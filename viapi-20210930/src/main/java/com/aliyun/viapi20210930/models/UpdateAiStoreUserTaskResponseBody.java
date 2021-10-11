// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class UpdateAiStoreUserTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static UpdateAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiStoreUserTaskResponseBody self = new UpdateAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAiStoreUserTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
