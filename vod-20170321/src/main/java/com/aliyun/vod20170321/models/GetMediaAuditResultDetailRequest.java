// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailRequest extends TeaModel {
    /**
     * <p>The category of the pornographic content review result. Valid values:</p>
     * <br>
     * <p>*   **normal**</p>
     * <p>*   **porn**</p>
     * <p>*   **sexy**</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The score of the review result category. It is representative of the confidence. Valid values: `[0.00-100.00].` The value is rounded down to 10 decimal places.</p>
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
