// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class EnableAiStoreUserTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static EnableAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAiStoreUserTaskResponseBody self = new EnableAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableAiStoreUserTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
