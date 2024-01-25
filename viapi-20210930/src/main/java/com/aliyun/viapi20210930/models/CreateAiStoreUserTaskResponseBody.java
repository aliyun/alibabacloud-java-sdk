// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreUserTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAiStoreUserTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreUserTaskResponseBody self = new CreateAiStoreUserTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreUserTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateAiStoreUserTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
