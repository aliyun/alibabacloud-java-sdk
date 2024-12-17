// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ “timestamp”: 1490164200000, “Maximum”: 100, “userId”: “1234567898765432”, “Minimum”: 4.55, “instanceId”: “i-bp18abl200xk9599ck7c”, “Average”: 93.84 }</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707ec2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>F3F44BE3-5419-4B61-9BAC-E66E295A****</p>
     */
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
