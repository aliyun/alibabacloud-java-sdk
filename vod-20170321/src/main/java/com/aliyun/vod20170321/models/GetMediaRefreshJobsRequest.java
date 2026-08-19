// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsRequest extends TeaModel {
    /**
     * <p>The audio or video ID, which is the <code>MediaIds</code> value specified when calling the <a href="https://help.aliyun.com/document_detail/431095.html">SubmitMediaRefreshJob</a> operation. Only one audio or video ID can be specified.</p>
     * <p>If this parameter is not specified, task information for all audio or video files under the specified <code>MediaRefreshJobId</code> is returned. If this parameter is specified, only the task information for the specified audio or video ID under the <code>MediaRefreshJobId</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b658067095869****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the audio or video purge or prefetch task. This is the value of MediaRefreshJobId returned by the <a href="https://help.aliyun.com/document_detail/431095.html">SubmitMediaRefreshJob</a> operation.</p>
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
