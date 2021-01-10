// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSamecodereporecommendRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutSamecodereporecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSamecodereporecommendRequest self = new GetLinkeBahamutSamecodereporecommendRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSamecodereporecommendRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
