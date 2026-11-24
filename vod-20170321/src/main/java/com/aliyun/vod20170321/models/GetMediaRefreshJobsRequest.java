// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsRequest extends TeaModel {
    /**
     * <p>The audio or video ID. The value is the <code>MediaIds</code> parameter passed when you call the <a href="https://help.aliyun.com/document_detail/431095.html">Submit audio and video refresh or prefetch tasks</a> API operation. You can specify only one audio or video ID.</p>
     * <p>If you do not specify this parameter, the task information of all audio and video files under the <code>MediaRefreshJobId</code> is queried. If you specify this parameter, only the task information of the specified audio or video file under the <code>MediaRefreshJobId</code> is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The task ID of the audio or video refresh or prefetch task. The value is the MediaRefreshJobId parameter returned by the <a href="https://help.aliyun.com/document_detail/431095.html">Submit audio and video refresh or prefetch tasks</a> API operation.</p>
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
