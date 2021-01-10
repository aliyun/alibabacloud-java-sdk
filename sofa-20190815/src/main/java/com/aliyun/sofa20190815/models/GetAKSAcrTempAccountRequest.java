// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrTempAccountRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static GetAKSAcrTempAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrTempAccountRequest self = new GetAKSAcrTempAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrTempAccountRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
