// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ForbiddenVideoIds")
    public java.util.List<String> forbiddenVideoIds;

    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    public static UpdateVideoInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosResponseBody self = new UpdateVideoInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
