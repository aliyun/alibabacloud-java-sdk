// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreReceiveConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public AiStoreReceiveConfig data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAiStoreReceiveConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreReceiveConfigResponseBody self = new CreateAiStoreReceiveConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreReceiveConfigResponseBody setData(AiStoreReceiveConfig data) {
        this.data = data;
        return this;
    }
    public AiStoreReceiveConfig getData() {
        return this.data;
    }

    public CreateAiStoreReceiveConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
