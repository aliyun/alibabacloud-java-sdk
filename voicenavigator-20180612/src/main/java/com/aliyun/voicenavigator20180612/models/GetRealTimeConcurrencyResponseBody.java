// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetRealTimeConcurrencyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxConcurrency")
    public Long maxConcurrency;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RealTimeConcurrency")
    public Long realTimeConcurrency;

    /**
     * <strong>example:</strong>
     * <p>E6E61E1A-D2DC-5ACF-AED4-A115B6691F98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1661584255029</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static GetRealTimeConcurrencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealTimeConcurrencyResponseBody self = new GetRealTimeConcurrencyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealTimeConcurrencyResponseBody setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public GetRealTimeConcurrencyResponseBody setRealTimeConcurrency(Long realTimeConcurrency) {
        this.realTimeConcurrency = realTimeConcurrency;
        return this;
    }
    public Long getRealTimeConcurrency() {
        return this.realTimeConcurrency;
    }

    public GetRealTimeConcurrencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealTimeConcurrencyResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
