// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryPushStatByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppRequest self = new QueryPushStatByAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryPushStatByAppRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPushStatByAppRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryPushStatByAppRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
