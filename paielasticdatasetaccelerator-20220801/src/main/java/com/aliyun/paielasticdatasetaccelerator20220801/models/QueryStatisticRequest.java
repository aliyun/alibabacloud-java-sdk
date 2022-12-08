// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryStatisticRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticRequest self = new QueryStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryStatisticRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public QueryStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
