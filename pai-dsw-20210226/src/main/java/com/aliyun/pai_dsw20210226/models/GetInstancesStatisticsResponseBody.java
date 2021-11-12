// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstancesStatisticsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 统计数据
    @NameInMap("Statistics")
    public java.util.Map<String, ?> statistics;

    public static GetInstancesStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesStatisticsResponseBody self = new GetInstancesStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstancesStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstancesStatisticsResponseBody setStatistics(java.util.Map<String, ?> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, ?> getStatistics() {
        return this.statistics;
    }

}
