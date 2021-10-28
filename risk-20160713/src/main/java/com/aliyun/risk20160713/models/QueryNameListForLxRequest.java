// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListForLxRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("QueryLike")
    public String queryLike;

    @NameInMap("Type")
    public String type;

    public static QueryNameListForLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListForLxRequest self = new QueryNameListForLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryNameListForLxRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryNameListForLxRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public QueryNameListForLxRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public QueryNameListForLxRequest setQueryLike(String queryLike) {
        this.queryLike = queryLike;
        return this;
    }
    public String getQueryLike() {
        return this.queryLike;
    }

    public QueryNameListForLxRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
