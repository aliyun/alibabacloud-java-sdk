// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldetailRequest extends TeaModel {
    @NameInMap("UniqueId")
    public String uniqueId;

    public static GetLinkeBahamutAoneinternaldetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldetailRequest self = new GetLinkeBahamutAoneinternaldetailRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldetailRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
