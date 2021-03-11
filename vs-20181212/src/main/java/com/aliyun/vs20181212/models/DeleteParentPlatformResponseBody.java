// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteParentPlatformResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteParentPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParentPlatformResponseBody self = new DeleteParentPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParentPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
