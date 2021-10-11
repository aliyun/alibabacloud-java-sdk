// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DisableAiStoreUserTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static DisableAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAiStoreUserTaskResponseBody self = new DisableAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableAiStoreUserTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
