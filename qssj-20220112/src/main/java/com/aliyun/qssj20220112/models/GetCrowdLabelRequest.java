// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdLabelRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetCrowdLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdLabelRequest self = new GetCrowdLabelRequest();
        return TeaModel.build(map, self);
    }

    public GetCrowdLabelRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
