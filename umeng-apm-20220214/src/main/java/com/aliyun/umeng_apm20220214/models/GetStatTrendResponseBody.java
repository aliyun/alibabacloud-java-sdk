// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetStatTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetStatTrendResponseBodyData> data;

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

    public static GetStatTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatTrendResponseBody self = new GetStatTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetStatTrendResponseBody setData(java.util.List<GetStatTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStatTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetStatTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetStatTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStatTrendResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("affectedUserCount")
        public Long affectedUserCount;

        /**
         * <strong>example:</strong>
         * <p>10.3</p>
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
         * <p>25.6</p>
         */
        @NameInMap("errorRate")
        public Double errorRate;

        /**
         * <strong>example:</strong>
         * <p>2021-06-01</p>
         */
        @NameInMap("timePoint")
        public String timePoint;

        public static GetStatTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStatTrendResponseBodyData self = new GetStatTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStatTrendResponseBodyData setAffectedUserCount(Long affectedUserCount) {
            this.affectedUserCount = affectedUserCount;
            return this;
        }
        public Long getAffectedUserCount() {
            return this.affectedUserCount;
        }

        public GetStatTrendResponseBodyData setAffectedUserRate(Double affectedUserRate) {
            this.affectedUserRate = affectedUserRate;
            return this;
        }
        public Double getAffectedUserRate() {
            return this.affectedUserRate;
        }

        public GetStatTrendResponseBodyData setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetStatTrendResponseBodyData setErrorRate(Double errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public Double getErrorRate() {
            return this.errorRate;
        }

        public GetStatTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
