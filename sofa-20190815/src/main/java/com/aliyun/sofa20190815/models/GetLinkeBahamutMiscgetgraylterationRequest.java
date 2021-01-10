// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    public static GetLinkeBahamutMiscgetgraylterationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationRequest self = new GetLinkeBahamutMiscgetgraylterationRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

}
