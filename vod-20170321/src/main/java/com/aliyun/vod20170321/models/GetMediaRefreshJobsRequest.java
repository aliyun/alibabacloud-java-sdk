// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsRequest extends TeaModel {
    /**
     * <p>The ID of the media file. It is the value of the `MediaIds` parameter that you specify when you call the [RefreshMediaPlayUrls](~~RefreshMediaPlayUrls~~) operation. You can specify only one media ID.</p>
     * <br>
     * <p>If you leave this parameter empty, information about all media files in the refresh or prefetch job specified by `MediaRefreshJobId` is returned. If you set this parameter, only the information about the specified media file is returned.``</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the refresh or prefetch job. It is the value of the MediaRefreshJobId parameter that is returned from the call to the [RefreshMediaPlayUrls](~~RefreshMediaPlayUrls~~) operation.</p>
     */
    @NameInMap("MediaRefreshJobId")
    public String mediaRefreshJobId;

    public static GetMediaRefreshJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRefreshJobsRequest self = new GetMediaRefreshJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaRefreshJobsRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaRefreshJobsRequest setMediaRefreshJobId(String mediaRefreshJobId) {
        this.mediaRefreshJobId = mediaRefreshJobId;
        return this;
    }
    public String getMediaRefreshJobId() {
        return this.mediaRefreshJobId;
    }

}
