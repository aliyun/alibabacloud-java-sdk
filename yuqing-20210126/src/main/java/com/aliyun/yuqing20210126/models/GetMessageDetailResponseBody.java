// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetMessageDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 舆情消息体
    @NameInMap("data")
    public String data;

    public static GetMessageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageDetailResponseBody self = new GetMessageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageDetailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
