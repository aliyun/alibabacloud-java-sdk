// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the media files that cannot be operated on. In most cases, media files cannot be operated on because you are not authorized to perform the operations. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("ForbiddenMediaIds")
    public String forbiddenMediaIds;

    /**
     * <p>The ID of the refresh or prefetch task.</p>
     */
    @NameInMap("MediaRefreshJobId")
    public String mediaRefreshJobId;

    /**
     * <p>The IDs of the media files that do not exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public String nonExistMediaIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshMediaPlayUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshMediaPlayUrlsResponseBody self = new RefreshMediaPlayUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshMediaPlayUrlsResponseBody setForbiddenMediaIds(String forbiddenMediaIds) {
        this.forbiddenMediaIds = forbiddenMediaIds;
        return this;
    }
    public String getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    public RefreshMediaPlayUrlsResponseBody setMediaRefreshJobId(String mediaRefreshJobId) {
        this.mediaRefreshJobId = mediaRefreshJobId;
        return this;
    }
    public String getMediaRefreshJobId() {
        return this.mediaRefreshJobId;
    }

    public RefreshMediaPlayUrlsResponseBody setNonExistMediaIds(String nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public String getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public RefreshMediaPlayUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
