// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanTimeseriesRequest extends TeaModel {
    @NameInMap("FullData")
    public Boolean fullData;

    @NameInMap("TimeSeriesId")
    public String timeSeriesId;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSPlanTimeseriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanTimeseriesRequest self = new GetAKSPlanTimeseriesRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanTimeseriesRequest setFullData(Boolean fullData) {
        this.fullData = fullData;
        return this;
    }
    public Boolean getFullData() {
        return this.fullData;
    }

    public GetAKSPlanTimeseriesRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public GetAKSPlanTimeseriesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
