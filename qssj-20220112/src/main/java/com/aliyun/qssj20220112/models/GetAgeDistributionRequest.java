// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetAgeDistributionRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetAgeDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgeDistributionRequest self = new GetAgeDistributionRequest();
        return TeaModel.build(map, self);
    }

    public GetAgeDistributionRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
