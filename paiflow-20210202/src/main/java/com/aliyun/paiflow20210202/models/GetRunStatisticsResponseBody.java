// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunStatisticsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 运行中run的个数
    @NameInMap("Running")
    public Long running;

    // 失败run的个数
    @NameInMap("Failed")
    public Long failed;

    public static GetRunStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunStatisticsResponseBody self = new GetRunStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunStatisticsResponseBody setRunning(Long running) {
        this.running = running;
        return this;
    }
    public Long getRunning() {
        return this.running;
    }

    public GetRunStatisticsResponseBody setFailed(Long failed) {
        this.failed = failed;
        return this;
    }
    public Long getFailed() {
        return this.failed;
    }

}
