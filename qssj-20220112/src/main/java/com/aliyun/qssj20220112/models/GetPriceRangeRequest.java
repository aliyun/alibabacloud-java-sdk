// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetPriceRangeRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetPriceRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceRangeRequest self = new GetPriceRangeRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceRangeRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
