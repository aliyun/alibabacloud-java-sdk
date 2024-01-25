// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DisableAiStoreUserTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DisableAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAiStoreUserTaskResponseBody self = new DisableAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAiStoreUserTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DisableAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
