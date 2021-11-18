// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserSpecialVersionGpuResourceInfoRequest extends TeaModel {
    // 付费类型
    @NameInMap("PayType")
    public Long payType;

    public static GetUserSpecialVersionGpuResourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserSpecialVersionGpuResourceInfoRequest self = new GetUserSpecialVersionGpuResourceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserSpecialVersionGpuResourceInfoRequest setPayType(Long payType) {
        this.payType = payType;
        return this;
    }
    public Long getPayType() {
        return this.payType;
    }

}
