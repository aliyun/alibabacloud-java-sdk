// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsRequest extends TeaModel {
    /**
     * <p>The ID of the media file. It is the value of the <code>MediaIds</code> parameter that you specify when you call the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation. You can specify only one media ID.</p>
     * <p>If you leave this parameter empty, information about all media files in the refresh or prefetch job specified by <code>MediaRefreshJobId</code> is returned. If you set this parameter, only the information about the specified media file is returned.``</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the refresh or prefetch job. It is the value of the MediaRefreshJobId parameter that is returned from the call to the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>41d465e31957****</p>
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
