// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAlarmDataListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 预警列表
    @NameInMap("pages")
    public java.util.List<AlarmData> pages;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryAlarmDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDataListResponseBody self = new QueryAlarmDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmDataListResponseBody setPages(java.util.List<AlarmData> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<AlarmData> getPages() {
        return this.pages;
    }

    public QueryAlarmDataListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
