// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoResponseBody extends TeaModel {
    /**
     * <p>The IDs of the videos that cannot be deleted.</p>
     * <p>> Generally, videos cannot be deleted if you do not have the required [permissions](~~113600~~).</p>
     */
    @NameInMap("ForbiddenVideoIds")
    public java.util.List<String> forbiddenVideoIds;

    /**
     * <p>The IDs of the videos that do not exist.</p>
     * <p>> If the list of videos to be deleted contains one or more videos that do not exist, the IDs of these non-existing videos are returned. If none of the videos in the list exists, a 404 error is returned.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoResponseBody self = new DeleteVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVideoResponseBody setForbiddenVideoIds(java.util.List<String> forbiddenVideoIds) {
        this.forbiddenVideoIds = forbiddenVideoIds;
        return this;
    }
    public java.util.List<String> getForbiddenVideoIds() {
        return this.forbiddenVideoIds;
    }

    public DeleteVideoResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public DeleteVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
