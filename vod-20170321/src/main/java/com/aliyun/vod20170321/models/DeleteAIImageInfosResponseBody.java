// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIImageInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIImageInfosResponseBody self = new DeleteAIImageInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIImageInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
