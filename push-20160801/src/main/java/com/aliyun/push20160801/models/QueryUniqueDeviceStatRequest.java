// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryUniqueDeviceStatRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryUniqueDeviceStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniqueDeviceStatRequest self = new QueryUniqueDeviceStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniqueDeviceStatRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryUniqueDeviceStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryUniqueDeviceStatRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryUniqueDeviceStatRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
