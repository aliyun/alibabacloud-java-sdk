// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSuspiciousStatisticsResponseBody extends TeaModel {
    @NameInMap("RemindCount")
    public Integer remindCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeriousCount")
    public Integer seriousCount;

    @NameInMap("SuspiciousCount")
    public Integer suspiciousCount;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetSuspiciousStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuspiciousStatisticsResponseBody self = new GetSuspiciousStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuspiciousStatisticsResponseBody setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
        return this;
    }
    public Integer getRemindCount() {
        return this.remindCount;
    }

    public GetSuspiciousStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuspiciousStatisticsResponseBody setSeriousCount(Integer seriousCount) {
        this.seriousCount = seriousCount;
        return this;
    }
    public Integer getSeriousCount() {
        return this.seriousCount;
    }

    public GetSuspiciousStatisticsResponseBody setSuspiciousCount(Integer suspiciousCount) {
        this.suspiciousCount = suspiciousCount;
        return this;
    }
    public Integer getSuspiciousCount() {
        return this.suspiciousCount;
    }

    public GetSuspiciousStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
