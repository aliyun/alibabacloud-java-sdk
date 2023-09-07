// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHoneypotAttackStatisticsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("StatisticsCount")
        public Integer statisticsCount;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HoneypotAttackStatistics")
        public java.util.List<GetHoneypotAttackStatisticsResponseBodyDataHoneypotAttackStatistics> honeypotAttackStatistics;

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
