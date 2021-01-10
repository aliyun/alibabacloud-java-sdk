// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationworkitemsRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    public static GetLinkeBahamutIterationworkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationworkitemsRequest self = new GetLinkeBahamutIterationworkitemsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationworkitemsRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

}
