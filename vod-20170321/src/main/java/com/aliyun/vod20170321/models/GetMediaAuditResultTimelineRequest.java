// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineRequest extends TeaModel {
    /**
     * <p>The ID of the video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static GetMediaAuditResultTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultTimelineRequest self = new GetMediaAuditResultTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultTimelineRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
