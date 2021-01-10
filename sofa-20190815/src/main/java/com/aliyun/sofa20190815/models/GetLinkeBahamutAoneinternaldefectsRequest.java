// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldefectsRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    public static GetLinkeBahamutAoneinternaldefectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldefectsRequest self = new GetLinkeBahamutAoneinternaldefectsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldefectsRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
