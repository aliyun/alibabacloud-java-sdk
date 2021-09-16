// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    public static UpdateAttachedMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosResponseBody self = new UpdateAttachedMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAttachedMediaInfosResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

}
