// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsResponseBody extends TeaModel {
    // 没有多应用权限的视频ID
    @NameInMap("ForbiddenMediaIds")
    public String forbiddenMediaIds;

    // 刷新预热任务ID
    @NameInMap("MediaRefreshJobId")
    public String mediaRefreshJobId;

    // 不存在的媒资ID
    @NameInMap("NonExistMediaIds")
    public String nonExistMediaIds;

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
