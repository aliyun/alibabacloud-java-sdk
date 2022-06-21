// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdReginRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetCrowdReginRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdReginRequest self = new GetCrowdReginRequest();
        return TeaModel.build(map, self);
    }

    public GetCrowdReginRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
