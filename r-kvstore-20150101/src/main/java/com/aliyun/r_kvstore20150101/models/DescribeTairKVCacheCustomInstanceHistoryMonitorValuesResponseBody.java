// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody extends TeaModel {
    @NameInMap("Datapoints")
    public String datapoints;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Period")
    public String period;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody self = new DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
