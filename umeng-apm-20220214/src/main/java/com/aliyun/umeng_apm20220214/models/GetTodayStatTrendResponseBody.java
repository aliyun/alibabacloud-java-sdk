// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetTodayStatTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetTodayStatTrendResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>succeed in handling request</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("affectedUserCount")
        public Long affectedUserCount;

        /**
         * <strong>example:</strong>
         * <p>10.21</p>
         */
        @NameInMap("affectedUserRate")
        public Double affectedUserRate;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("errorCount")
        public Long errorCount;

        /**
         * <strong>example:</strong>
         * <p>17.24</p>
         */
        @NameInMap("errorRate")
        public Double errorRate;

        /**
         * <strong>example:</strong>
         * <p>13:00</p>
         */
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
