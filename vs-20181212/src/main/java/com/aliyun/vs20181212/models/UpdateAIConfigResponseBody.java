// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateAIConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAIConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIConfigResponseBody self = new UpdateAIConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAIConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
