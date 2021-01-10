// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutExpressionexpressiontestRequest extends TeaModel {
    @NameInMap("Expression")
    public String expression;

    @NameInMap("UnitId")
    public String unitId;

    public static QueryLinkeBahamutExpressionexpressiontestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutExpressionexpressiontestRequest self = new QueryLinkeBahamutExpressionexpressiontestRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutExpressionexpressiontestRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public QueryLinkeBahamutExpressionexpressiontestRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
