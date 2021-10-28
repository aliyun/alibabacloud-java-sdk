// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListShrinkRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("QueryLike")
    public String queryLike;

    @NameInMap("Type")
    public String type;

    public static QueryNameListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListShrinkRequest self = new QueryNameListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryNameListShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryNameListShrinkRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public QueryNameListShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public QueryNameListShrinkRequest setQueryLike(String queryLike) {
        this.queryLike = queryLike;
        return this;
    }
    public String getQueryLike() {
        return this.queryLike;
    }

    public QueryNameListShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
