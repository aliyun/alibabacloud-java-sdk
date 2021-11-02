// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaResponseBody extends TeaModel {
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAttachedMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttachedMediaResponseBody self = new DeleteAttachedMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAttachedMediaResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public DeleteAttachedMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
