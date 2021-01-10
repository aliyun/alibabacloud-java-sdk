// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaseappsRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static GetLinkeBahamutReleaseappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaseappsRequest self = new GetLinkeBahamutReleaseappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaseappsRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
