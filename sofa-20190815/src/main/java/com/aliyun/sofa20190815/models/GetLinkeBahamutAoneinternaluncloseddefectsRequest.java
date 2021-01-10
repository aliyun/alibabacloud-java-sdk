// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectsRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    public static GetLinkeBahamutAoneinternaluncloseddefectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectsRequest self = new GetLinkeBahamutAoneinternaluncloseddefectsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
