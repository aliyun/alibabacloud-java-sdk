// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutIterationunitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitRequest self = new GetLinkeBahamutIterationunitRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
