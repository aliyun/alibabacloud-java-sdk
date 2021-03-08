// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

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
