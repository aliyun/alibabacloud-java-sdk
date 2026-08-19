// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoResponseBody extends TeaModel {
    /**
     * <p>The list of video IDs for which the operation is forbidden.</p>
     * <blockquote>
     * <p>This is typically caused by insufficient <a href="https://help.aliyun.com/document_detail/113600.html">permissions</a>.</p>
     * </blockquote>
     */
    @NameInMap("ForbiddenVideoIds")
    public java.util.List<String> forbiddenVideoIds;

    /**
     * <p>The list of custom IDs that do not exist.</p>
     */
    @NameInMap("NonExistReferenceIds")
    public java.util.List<String> nonExistReferenceIds;

    /**
     * <p>The list of video IDs that do not exist.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
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

    public DeleteVideoResponseBody setNonExistReferenceIds(java.util.List<String> nonExistReferenceIds) {
        this.nonExistReferenceIds = nonExistReferenceIds;
        return this;
    }
    public java.util.List<String> getNonExistReferenceIds() {
        return this.nonExistReferenceIds;
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
