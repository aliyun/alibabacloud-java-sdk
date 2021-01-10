// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlterationunitsbyreleaseRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static GetLinkeBahamutWebapigetlterationunitsbyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlterationunitsbyreleaseRequest self = new GetLinkeBahamutWebapigetlterationunitsbyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlterationunitsbyreleaseRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
