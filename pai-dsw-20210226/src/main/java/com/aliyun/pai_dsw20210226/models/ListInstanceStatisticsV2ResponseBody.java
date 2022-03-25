// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsV2ResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 统计信息
    @NameInMap("Statistics")
    public java.util.Map<String, java.util.Map<String, ?>> statistics;

    public static ListInstanceStatisticsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsV2ResponseBody self = new ListInstanceStatisticsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatisticsV2ResponseBody setStatistics(java.util.Map<String, java.util.Map<String, ?>> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getStatistics() {
        return this.statistics;
    }

}
