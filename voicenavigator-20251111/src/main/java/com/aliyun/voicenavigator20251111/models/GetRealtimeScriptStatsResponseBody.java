// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeScriptStatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRealtimeScriptStatsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4060</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeScriptStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeScriptStatsResponseBody self = new GetRealtimeScriptStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeScriptStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealtimeScriptStatsResponseBody setData(GetRealtimeScriptStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeScriptStatsResponseBodyData getData() {
        return this.data;
    }

    public GetRealtimeScriptStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRealtimeScriptStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRealtimeScriptStatsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetRealtimeScriptStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeScriptStatsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Integer configuredConcurrency;

        /**
         * <strong>example:</strong>
         * <p>1774881658931</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Integer usedConcurrency;

        public static GetRealtimeScriptStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeScriptStatsResponseBodyData self = new GetRealtimeScriptStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeScriptStatsResponseBodyData setConfiguredConcurrency(Integer configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Integer getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public GetRealtimeScriptStatsResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetRealtimeScriptStatsResponseBodyData setUsedConcurrency(Integer usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Integer getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

}
