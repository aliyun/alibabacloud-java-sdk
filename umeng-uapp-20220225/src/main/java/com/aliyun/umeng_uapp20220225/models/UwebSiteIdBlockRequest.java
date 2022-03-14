// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_uapp20220225.models;

import com.aliyun.tea.*;

public class UwebSiteIdBlockRequest extends TeaModel {
    // siteId
    @NameInMap("SiteId")
    public String siteId;

    public static UwebSiteIdBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UwebSiteIdBlockRequest self = new UwebSiteIdBlockRequest();
        return TeaModel.build(map, self);
    }

    public UwebSiteIdBlockRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

}
