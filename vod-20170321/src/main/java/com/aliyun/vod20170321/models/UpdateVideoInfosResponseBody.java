// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosResponseBody extends TeaModel {
    // The IDs of the videos that cannot be modified. Generally, videos cannot be modified if you do not have required [permissions](~~113600~~).
    @NameInMap("ForbiddenVideoIds")
    public java.util.List<String> forbiddenVideoIds;

    // The IDs of the videos that do not exist.
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVideoInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosResponseBody self = new UpdateVideoInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfosResponseBody setForbiddenVideoIds(java.util.List<String> forbiddenVideoIds) {
        this.forbiddenVideoIds = forbiddenVideoIds;
        return this;
    }
    public java.util.List<String> getForbiddenVideoIds() {
        return this.forbiddenVideoIds;
    }

    public UpdateVideoInfosResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public UpdateVideoInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
