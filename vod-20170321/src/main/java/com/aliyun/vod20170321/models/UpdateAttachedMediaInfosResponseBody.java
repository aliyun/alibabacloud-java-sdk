// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosResponseBody extends TeaModel {
    /**
     * <p>The IDs of the auxiliary media assets that do not exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4DF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAttachedMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosResponseBody self = new UpdateAttachedMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public UpdateAttachedMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
