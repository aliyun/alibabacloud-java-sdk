// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryReportNotifiesResponseBody extends TeaModel {
    // 报告历史发送信息
    @NameInMap("reportNotifyRecordList")
    public java.util.List<ReportNotifyRecord> reportNotifyRecordList;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总数量
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryReportNotifiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReportNotifiesResponseBody self = new QueryReportNotifiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReportNotifiesResponseBody setReportNotifyRecordList(java.util.List<ReportNotifyRecord> reportNotifyRecordList) {
        this.reportNotifyRecordList = reportNotifyRecordList;
        return this;
    }
    public java.util.List<ReportNotifyRecord> getReportNotifyRecordList() {
        return this.reportNotifyRecordList;
    }

    public QueryReportNotifiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReportNotifiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
