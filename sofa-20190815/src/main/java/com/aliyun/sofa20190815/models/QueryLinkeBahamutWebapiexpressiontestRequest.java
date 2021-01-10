// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiexpressiontestRequest extends TeaModel {
    @NameInMap("UnitId")
    public String unitId;

    public static QueryLinkeBahamutWebapiexpressiontestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiexpressiontestRequest self = new QueryLinkeBahamutWebapiexpressiontestRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiexpressiontestRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
