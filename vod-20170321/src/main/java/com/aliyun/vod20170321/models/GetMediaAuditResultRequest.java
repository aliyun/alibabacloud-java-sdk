// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **GetMediaAuditResult**.</p>
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
