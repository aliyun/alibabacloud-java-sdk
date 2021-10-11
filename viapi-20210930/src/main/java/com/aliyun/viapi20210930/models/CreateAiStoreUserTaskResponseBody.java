// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreUserTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Long data;

    public static CreateAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreUserTaskResponseBody self = new CreateAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAiStoreUserTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
