// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    public static GetBizTypeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigRequest self = new GetBizTypeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
