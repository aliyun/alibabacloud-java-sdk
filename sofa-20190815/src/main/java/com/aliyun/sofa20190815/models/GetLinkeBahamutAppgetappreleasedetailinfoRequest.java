// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgetappreleasedetailinfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static GetLinkeBahamutAppgetappreleasedetailinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgetappreleasedetailinfoRequest self = new GetLinkeBahamutAppgetappreleasedetailinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
