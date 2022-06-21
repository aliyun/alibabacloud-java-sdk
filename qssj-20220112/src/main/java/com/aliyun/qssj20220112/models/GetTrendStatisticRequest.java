// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendStatisticRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetTrendStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendStatisticRequest self = new GetTrendStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendStatisticRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
