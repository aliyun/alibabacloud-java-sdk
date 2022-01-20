// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 统计信息
    @NameInMap("Statistics")
    public java.util.Map<String, java.util.Map<String, ?>> statistics;

    public static ListInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsResponseBody self = new ListInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatisticsResponseBody setStatistics(java.util.Map<String, java.util.Map<String, ?>> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getStatistics() {
        return this.statistics;
    }

}
