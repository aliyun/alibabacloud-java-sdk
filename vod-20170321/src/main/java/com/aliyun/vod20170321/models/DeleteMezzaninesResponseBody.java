// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the audio or video files that do not exist.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the audio or video files whose source files cannot be deleted.</p>
     * <br>
     * <p>>  In most cases, source files cannot be deleted if they are used for original-quality playback or you do not have required permissions to delete them. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("UnRemoveableVideoIds")
    public java.util.List<String> unRemoveableVideoIds;

    public static DeleteMezzaninesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesResponseBody self = new DeleteMezzaninesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public DeleteMezzaninesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMezzaninesResponseBody setUnRemoveableVideoIds(java.util.List<String> unRemoveableVideoIds) {
        this.unRemoveableVideoIds = unRemoveableVideoIds;
        return this;
    }
    public java.util.List<String> getUnRemoveableVideoIds() {
        return this.unRemoveableVideoIds;
    }

}
