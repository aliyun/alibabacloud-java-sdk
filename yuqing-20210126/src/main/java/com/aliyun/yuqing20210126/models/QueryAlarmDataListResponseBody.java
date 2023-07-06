// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAlarmDataListResponseBody extends TeaModel {
    @NameInMap("pages")
    public java.util.List<AlarmData> pages;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryAlarmDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDataListResponseBody self = new QueryAlarmDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDataListResponseBody setPages(java.util.List<AlarmData> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<AlarmData> getPages() {
        return this.pages;
    }

    public QueryAlarmDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmDataListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
