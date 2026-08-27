// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetModelOperatorOrderRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static GetModelOperatorOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelOperatorOrderRequest self = new GetModelOperatorOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetModelOperatorOrderRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
