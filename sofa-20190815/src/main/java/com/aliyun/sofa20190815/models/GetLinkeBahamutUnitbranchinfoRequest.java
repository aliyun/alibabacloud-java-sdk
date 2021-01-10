// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitbranchinfoRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutUnitbranchinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitbranchinfoRequest self = new GetLinkeBahamutUnitbranchinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitbranchinfoRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
