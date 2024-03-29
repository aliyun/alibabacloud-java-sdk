// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefsRequest extends TeaModel {
    @NameInMap("LatestTimestamp")
    public String latestTimestamp;

    @NameInMap("RangeEnd")
    public Integer rangeEnd;

    @NameInMap("RangeStart")
    public Integer rangeStart;

    @NameInMap("Timestamp")
    public String timestamp;

    public static GetAlgorithmDefsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefsRequest self = new GetAlgorithmDefsRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefsRequest setLatestTimestamp(String latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
        return this;
    }
    public String getLatestTimestamp() {
        return this.latestTimestamp;
    }

    public GetAlgorithmDefsRequest setRangeEnd(Integer rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }
    public Integer getRangeEnd() {
        return this.rangeEnd;
    }

    public GetAlgorithmDefsRequest setRangeStart(Integer rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }
    public Integer getRangeStart() {
        return this.rangeStart;
    }

    public GetAlgorithmDefsRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
