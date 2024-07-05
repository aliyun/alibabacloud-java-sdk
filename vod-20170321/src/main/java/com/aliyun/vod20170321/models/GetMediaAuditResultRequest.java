// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultRequest extends TeaModel {
    /**
     * <p>The ID of the video or image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static GetMediaAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultRequest self = new GetMediaAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
