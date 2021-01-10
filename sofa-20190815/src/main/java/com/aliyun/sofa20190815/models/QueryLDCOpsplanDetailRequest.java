// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanDetailRequest extends TeaModel {
    @NameInMap("TimeSeriesId")
    public String timeSeriesId;

    public static QueryLDCOpsplanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanDetailRequest self = new QueryLDCOpsplanDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanDetailRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

}
