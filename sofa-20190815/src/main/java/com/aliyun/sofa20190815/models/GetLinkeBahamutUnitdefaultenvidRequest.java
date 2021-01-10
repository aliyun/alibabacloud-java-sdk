// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitdefaultenvidRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutUnitdefaultenvidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitdefaultenvidRequest self = new GetLinkeBahamutUnitdefaultenvidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitdefaultenvidRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
