// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetTodayStatTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetTodayStatTrendResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    public static GetTodayStatTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTodayStatTrendResponseBody self = new GetTodayStatTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTodayStatTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTodayStatTrendResponseBody setData(java.util.List<GetTodayStatTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTodayStatTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetTodayStatTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetTodayStatTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTodayStatTrendResponseBodyData extends TeaModel {
        @NameInMap("affectedUserCount")
        public Long affectedUserCount;

        @NameInMap("affectedUserRate")
        public Double affectedUserRate;

        @NameInMap("errorCount")
        public Long errorCount;

        @NameInMap("errorRate")
        public Double errorRate;

        @NameInMap("timePoint")
        public String timePoint;

        public static GetTodayStatTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTodayStatTrendResponseBodyData self = new GetTodayStatTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTodayStatTrendResponseBodyData setAffectedUserCount(Long affectedUserCount) {
            this.affectedUserCount = affectedUserCount;
            return this;
        }
        public Long getAffectedUserCount() {
            return this.affectedUserCount;
        }

        public GetTodayStatTrendResponseBodyData setAffectedUserRate(Double affectedUserRate) {
            this.affectedUserRate = affectedUserRate;
            return this;
        }
        public Double getAffectedUserRate() {
            return this.affectedUserRate;
        }

        public GetTodayStatTrendResponseBodyData setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetTodayStatTrendResponseBodyData setErrorRate(Double errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public Double getErrorRate() {
            return this.errorRate;
        }

        public GetTodayStatTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
