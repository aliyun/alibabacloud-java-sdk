// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetErrorMinuteStatTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetErrorMinuteStatTrendResponseBodyData> data;

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

    public static GetErrorMinuteStatTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorMinuteStatTrendResponseBody self = new GetErrorMinuteStatTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorMinuteStatTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetErrorMinuteStatTrendResponseBody setData(java.util.List<GetErrorMinuteStatTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetErrorMinuteStatTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetErrorMinuteStatTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetErrorMinuteStatTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetErrorMinuteStatTrendResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("errorCount")
        public Long errorCount;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("launchCount")
        public Long launchCount;

        /**
         * <strong>example:</strong>
         * <p>2023-05-20 13:01</p>
         */
        @NameInMap("timePoint")
        public String timePoint;

        public static GetErrorMinuteStatTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetErrorMinuteStatTrendResponseBodyData self = new GetErrorMinuteStatTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetErrorMinuteStatTrendResponseBodyData setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetErrorMinuteStatTrendResponseBodyData setLaunchCount(Long launchCount) {
            this.launchCount = launchCount;
            return this;
        }
        public Long getLaunchCount() {
            return this.launchCount;
        }

        public GetErrorMinuteStatTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
