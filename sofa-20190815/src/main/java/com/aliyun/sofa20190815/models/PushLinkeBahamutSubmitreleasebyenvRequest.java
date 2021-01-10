// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleasebyenvRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static PushLinkeBahamutSubmitreleasebyenvRequest build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleasebyenvRequest self = new PushLinkeBahamutSubmitreleasebyenvRequest();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleasebyenvRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
