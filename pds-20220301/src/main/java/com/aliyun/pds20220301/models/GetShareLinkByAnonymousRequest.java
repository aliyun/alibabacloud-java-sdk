// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkByAnonymousRequest extends TeaModel {
    /**
     * <p>The share ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static GetShareLinkByAnonymousRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkByAnonymousRequest self = new GetShareLinkByAnonymousRequest();
        return TeaModel.build(map, self);
    }

    public GetShareLinkByAnonymousRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
