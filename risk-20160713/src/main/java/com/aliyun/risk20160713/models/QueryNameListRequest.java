// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListRequest extends TeaModel {
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

    public static QueryNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListRequest self = new QueryNameListRequest();
        return TeaModel.build(map, self);
    }

    public QueryNameListRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryNameListRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public QueryNameListRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public QueryNameListRequest setQueryLike(String queryLike) {
        this.queryLike = queryLike;
        return this;
    }
    public String getQueryLike() {
        return this.queryLike;
    }

    public QueryNameListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
