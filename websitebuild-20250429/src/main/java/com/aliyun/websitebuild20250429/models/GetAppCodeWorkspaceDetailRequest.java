// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppCodeWorkspaceDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1071596645435968</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    public static GetAppCodeWorkspaceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppCodeWorkspaceDetailRequest self = new GetAppCodeWorkspaceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAppCodeWorkspaceDetailRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

}
