// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagebranchinfoRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutStagebranchinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagebranchinfoRequest self = new GetLinkeBahamutStagebranchinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagebranchinfoRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
