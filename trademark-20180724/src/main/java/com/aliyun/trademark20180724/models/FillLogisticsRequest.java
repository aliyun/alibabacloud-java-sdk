// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FillLogisticsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Logistics")
    public String logistics;

    public static FillLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        FillLogisticsRequest self = new FillLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public FillLogisticsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FillLogisticsRequest setLogistics(String logistics) {
        this.logistics = logistics;
        return this;
    }
    public String getLogistics() {
        return this.logistics;
    }

}
