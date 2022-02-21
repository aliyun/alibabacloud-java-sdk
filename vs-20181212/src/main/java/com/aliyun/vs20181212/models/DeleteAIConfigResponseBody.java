// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteAIConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIConfigResponseBody self = new DeleteAIConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
