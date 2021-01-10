// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitenvidsRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutUnitenvidsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitenvidsRequest self = new GetLinkeBahamutUnitenvidsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitenvidsRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
