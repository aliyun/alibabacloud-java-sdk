// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesResponseBody extends TeaModel {
    /**
     * <p>The list of custom IDs that do not exist.</p>
     */
    @NameInMap("NonExistReferenceIds")
    public java.util.List<String> nonExistReferenceIds;

    /**
     * <p>The list of audio or video IDs that do not exist.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of audio or video IDs that cannot be deleted.</p>
     * <blockquote>
     * <p>This is typically because the source file is used as the original stream (if the video transcoding pattern is no transcoding or asynchronous transcoding, the source file is used as the original stream for playback and cannot be deleted by default) or because of insufficient <a href="https://help.aliyun.com/document_detail/113600.html">permissions</a>.</p>
     * </blockquote>
     */
    @NameInMap("UnRemoveableVideoIds")
    public java.util.List<String> unRemoveableVideoIds;

    public static DeleteMezzaninesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesResponseBody self = new DeleteMezzaninesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesResponseBody setNonExistReferenceIds(java.util.List<String> nonExistReferenceIds) {
        this.nonExistReferenceIds = nonExistReferenceIds;
        return this;
    }
    public java.util.List<String> getNonExistReferenceIds() {
        return this.nonExistReferenceIds;
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
