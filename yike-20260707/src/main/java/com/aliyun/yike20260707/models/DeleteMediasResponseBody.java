// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteMediasResponseBody extends TeaModel {
    /**
     * <p>The IDs or input URLs that are forbidden to delete.</p>
     */
    @NameInMap("ForbiddenList")
    public java.util.List<String> forbiddenList;

    /**
     * <p>The ignored IDs or input URLs (invalid or items with retrieval errors).</p>
     */
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediasResponseBody self = new DeleteMediasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediasResponseBody setForbiddenList(java.util.List<String> forbiddenList) {
        this.forbiddenList = forbiddenList;
        return this;
    }
    public java.util.List<String> getForbiddenList() {
        return this.forbiddenList;
    }

    public DeleteMediasResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public DeleteMediasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
