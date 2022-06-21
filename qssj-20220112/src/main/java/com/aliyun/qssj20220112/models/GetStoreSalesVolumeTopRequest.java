// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSalesVolumeTopRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetStoreSalesVolumeTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSalesVolumeTopRequest self = new GetStoreSalesVolumeTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStoreSalesVolumeTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
