// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutExternalreleaseappRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static GetLinkeBahamutExternalreleaseappRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutExternalreleaseappRequest self = new GetLinkeBahamutExternalreleaseappRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutExternalreleaseappRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
