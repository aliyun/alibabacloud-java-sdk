// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkRequest extends TeaModel {
    /**
     * <p>The share ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static GetShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkRequest self = new GetShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
