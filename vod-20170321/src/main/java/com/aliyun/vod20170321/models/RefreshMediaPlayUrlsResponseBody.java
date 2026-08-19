// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsResponseBody extends TeaModel {
    /**
     * <p>The list of audio or video IDs that are forbidden. This is typically because you do not have multi-application permissions. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>a6e49sfgd23p5g9ja7095863****</p>
     */
    @NameInMap("ForbiddenMediaIds")
    public String forbiddenMediaIds;

    /**
     * <p>The ID of the refresh or prefetch task.</p>
     * 
     * <strong>example:</strong>
     * <p>41d465e31957****</p>
     */
    @NameInMap("MediaRefreshJobId")
    public String mediaRefreshJobId;

    /**
     * <p>The list of audio or video IDs that do not exist.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****</p>
     */
    @NameInMap("NonExistMediaIds")
    public String nonExistMediaIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-04D5-D7393642****</p>
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
