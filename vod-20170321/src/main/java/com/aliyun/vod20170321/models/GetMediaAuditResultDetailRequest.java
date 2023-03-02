// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailRequest extends TeaModel {
    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The page number of the review result to return. The default value is **1**. A maximum of **20** records can be returned on each page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    public static GetMediaAuditResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailRequest self = new GetMediaAuditResultDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultDetailRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaAuditResultDetailRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

}
