// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsResponseBody extends TeaModel {
    /**
     * <p>The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The statistics.</p>
     */
    @NameInMap("Data")
    public GetHoneypotAttackStatisticsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotAttackStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotAttackStatisticsResponseBody self = new GetHoneypotAttackStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotAttackStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotAttackStatisticsResponseBody setData(GetHoneypotAttackStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneypotAttackStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetHoneypotAttackStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotAttackStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotAttackStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotAttackStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics extends TeaModel {
        /**
         * <p>The number of times the value is counted.</p>
         */
        @NameInMap("StatisticsCount")
        public Integer statisticsCount;

        /**
         * <p>The statistical value.</p>
         */
        @NameInMap("StatisticsValue")
        public String statisticsValue;

        public static GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics self = new GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics();
            return TeaModel.build(map, self);
        }

        public GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics setStatisticsCount(Integer statisticsCount) {
            this.statisticsCount = statisticsCount;
            return this;
        }
        public Integer getStatisticsCount() {
            return this.statisticsCount;
        }

        public GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics setStatisticsValue(String statisticsValue) {
            this.statisticsValue = statisticsValue;
            return this;
        }
        public String getStatisticsValue() {
            return this.statisticsValue;
        }

    }

    public static class GetHoneypotAttackStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of entries on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The statistics details.</p>
         */
        @NameInMap("HoneypotAttackStatistics")
        public java.util.List<GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics> honeypotAttackStatistics;

        /**
         * <p>The type of the attack source statistics. Valid values:</p>
         * <br>
         * <p>*   **TOP_ATTACKED_AGENT**: the top five probes that are attacked the most frequently.</p>
         * <p>*   **TOP_ATTACKED_IP**: the top five IP addresses that are attacked the most frequently.</p>
         * <p>*   **ATTACK_EVENT_TYPE**: the type of the intrusion event.</p>
         * <p>*   **ATTACK_HONEYPOT_TYPE**: the type of the attacked honeypot.</p>
         */
        @NameInMap("StatisticsType")
        public String statisticsType;

        public static GetHoneypotAttackStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotAttackStatisticsResponseBodyData self = new GetHoneypotAttackStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotAttackStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetHoneypotAttackStatisticsResponseBodyData setHoneypotAttackStatistics(java.util.List<GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics> honeypotAttackStatistics) {
            this.honeypotAttackStatistics = honeypotAttackStatistics;
            return this;
        }
        public java.util.List<GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics> getHoneypotAttackStatistics() {
            return this.honeypotAttackStatistics;
        }

        public GetHoneypotAttackStatisticsResponseBodyData setStatisticsType(String statisticsType) {
            this.statisticsType = statisticsType;
            return this;
        }
        public String getStatisticsType() {
            return this.statisticsType;
        }

    }

}
