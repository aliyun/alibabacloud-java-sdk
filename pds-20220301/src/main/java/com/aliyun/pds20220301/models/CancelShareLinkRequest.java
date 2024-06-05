// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CancelShareLinkRequest extends TeaModel {
    /**
     * <p>The share ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static CancelShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelShareLinkRequest self = new CancelShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
