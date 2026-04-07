// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRealtimeInstanceStatsResponseBodyData data;

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
     * <p>3a530dc0-7cfa-48f6-9539-bf9001e77b16</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeInstanceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatsResponseBody self = new GetRealtimeInstanceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealtimeInstanceStatsResponseBody setData(GetRealtimeInstanceStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeInstanceStatsResponseBodyData getData() {
        return this.data;
    }

    public GetRealtimeInstanceStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRealtimeInstanceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRealtimeInstanceStatsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetRealtimeInstanceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Integer configuredConcurrency;

        /**
         * <strong>example:</strong>
         * <p>92836ced-6f3a-4cec-bc3d-c3893d3c7efa</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>TypeCombinationTest</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>1774881208361</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Integer usedConcurrency;

        public static GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList self = new GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList();
            return TeaModel.build(map, self);
        }

        public GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList setConfiguredConcurrency(Integer configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Integer getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList setUsedConcurrency(Integer usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Integer getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

    public static class GetRealtimeInstanceStatsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Integer configuredConcurrency;

        @NameInMap("RealtimeScriptStatsList")
        public java.util.List<GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList> realtimeScriptStatsList;

        /**
         * <strong>example:</strong>
         * <p>1774881208361</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Integer usedConcurrency;

        public static GetRealtimeInstanceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeInstanceStatsResponseBodyData self = new GetRealtimeInstanceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeInstanceStatsResponseBodyData setConfiguredConcurrency(Integer configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Integer getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public GetRealtimeInstanceStatsResponseBodyData setRealtimeScriptStatsList(java.util.List<GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList> realtimeScriptStatsList) {
            this.realtimeScriptStatsList = realtimeScriptStatsList;
            return this;
        }
        public java.util.List<GetRealtimeInstanceStatsResponseBodyDataRealtimeScriptStatsList> getRealtimeScriptStatsList() {
            return this.realtimeScriptStatsList;
        }

        public GetRealtimeInstanceStatsResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetRealtimeInstanceStatsResponseBodyData setUsedConcurrency(Integer usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Integer getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

}
