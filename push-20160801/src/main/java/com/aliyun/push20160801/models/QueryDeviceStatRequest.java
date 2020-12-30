// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceStatRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("QueryType")
    public String queryType;

    public static QueryDeviceStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatRequest self = new QueryDeviceStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryDeviceStatRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryDeviceStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryDeviceStatRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public QueryDeviceStatRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
