// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetSpotPriceHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8BDA4440-DD3C-5F4B-BBDD-94A9CE1E75C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpotPriceHistory")
    public java.util.List<SpotPriceItem> spotPriceHistory;

    /**
     * <strong>example:</strong>
     * <p>194</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetSpotPriceHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpotPriceHistoryResponseBody self = new GetSpotPriceHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpotPriceHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpotPriceHistoryResponseBody setSpotPriceHistory(java.util.List<SpotPriceItem> spotPriceHistory) {
        this.spotPriceHistory = spotPriceHistory;
        return this;
    }
    public java.util.List<SpotPriceItem> getSpotPriceHistory() {
        return this.spotPriceHistory;
    }

    public GetSpotPriceHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
