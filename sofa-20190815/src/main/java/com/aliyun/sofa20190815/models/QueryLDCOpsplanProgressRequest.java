// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanProgressRequest extends TeaModel {
    @NameInMap("TimeSeriesId")
    public String timeSeriesId;

    public static QueryLDCOpsplanProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanProgressRequest self = new QueryLDCOpsplanProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanProgressRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

}
