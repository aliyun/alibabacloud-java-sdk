// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreReceiveConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public AiStoreReceiveConfig data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAiStoreReceiveConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreReceiveConfigResponseBody self = new GetAiStoreReceiveConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiStoreReceiveConfigResponseBody setData(AiStoreReceiveConfig data) {
        this.data = data;
        return this;
    }
    public AiStoreReceiveConfig getData() {
        return this.data;
    }

    public GetAiStoreReceiveConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
