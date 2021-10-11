// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreReceiveConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AiStoreReceiveConfig data;

    public static GetAiStoreReceiveConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreReceiveConfigResponseBody self = new GetAiStoreReceiveConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiStoreReceiveConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiStoreReceiveConfigResponseBody setData(AiStoreReceiveConfig data) {
        this.data = data;
        return this;
    }
    public AiStoreReceiveConfig getData() {
        return this.data;
    }

}
