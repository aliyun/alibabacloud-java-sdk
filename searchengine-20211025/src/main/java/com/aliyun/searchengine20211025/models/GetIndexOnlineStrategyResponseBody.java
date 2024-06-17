// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexOnlineStrategyResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>FE03180A-0E29-5474-8A86-33F0683294A4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>IndexOnlineStrategy</p>
     */
    @NameInMap("result")
    public GetIndexOnlineStrategyResponseBodyResult result;

    public static GetIndexOnlineStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexOnlineStrategyResponseBody self = new GetIndexOnlineStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexOnlineStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexOnlineStrategyResponseBody setResult(GetIndexOnlineStrategyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIndexOnlineStrategyResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetIndexOnlineStrategyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("changeRate")
        public Integer changeRate;

        public static GetIndexOnlineStrategyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetIndexOnlineStrategyResponseBodyResult self = new GetIndexOnlineStrategyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetIndexOnlineStrategyResponseBodyResult setChangeRate(Integer changeRate) {
            this.changeRate = changeRate;
            return this;
        }
        public Integer getChangeRate() {
            return this.changeRate;
        }

    }

}
