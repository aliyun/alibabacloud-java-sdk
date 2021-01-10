// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationworkitemsRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    public static GetLinkeBahamutIterationgetiterationworkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationworkitemsRequest self = new GetLinkeBahamutIterationgetiterationworkitemsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationworkitemsRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

}
