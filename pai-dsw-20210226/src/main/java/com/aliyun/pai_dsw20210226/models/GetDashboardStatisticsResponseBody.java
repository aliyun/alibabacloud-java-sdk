// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetDashboardStatisticsResponseBody extends TeaModel {
    // 实例数
    @NameInMap("InstanceTotal")
    public Long instanceTotal;

    // 运行实例数
    @NameInMap("InstsanceRunningTotal")
    public Long instsanceRunningTotal;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetDashboardStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardStatisticsResponseBody self = new GetDashboardStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDashboardStatisticsResponseBody setInstanceTotal(Long instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }
    public Long getInstanceTotal() {
        return this.instanceTotal;
    }

    public GetDashboardStatisticsResponseBody setInstsanceRunningTotal(Long instsanceRunningTotal) {
        this.instsanceRunningTotal = instsanceRunningTotal;
        return this;
    }
    public Long getInstsanceRunningTotal() {
        return this.instsanceRunningTotal;
    }

    public GetDashboardStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
