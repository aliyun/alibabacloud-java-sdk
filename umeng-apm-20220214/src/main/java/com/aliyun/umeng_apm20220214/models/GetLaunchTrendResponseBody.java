// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetLaunchTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetLaunchTrendResponseBodyData> data;

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

    public static GetLaunchTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLaunchTrendResponseBody self = new GetLaunchTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLaunchTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLaunchTrendResponseBody setData(java.util.List<GetLaunchTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLaunchTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetLaunchTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetLaunchTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLaunchTrendResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2495</p>
         */
        @NameInMap("coldLaunchCount")
        public Long coldLaunchCount;

        /**
         * <strong>example:</strong>
         * <p>3784.5</p>
         */
        @NameInMap("coldLaunchDuration")
        public Double coldLaunchDuration;

        /**
         * <strong>example:</strong>
         * <p>2495</p>
         */
        @NameInMap("firstLaunchCount")
        public Long firstLaunchCount;

        /**
         * <strong>example:</strong>
         * <p>3740.5</p>
         */
        @NameInMap("firstLaunchDuration")
        public Double firstLaunchDuration;

        /**
         * <strong>example:</strong>
         * <p>2495</p>
         */
        @NameInMap("hotLaunchCount")
        public Long hotLaunchCount;

        /**
         * <strong>example:</strong>
         * <p>1400.5</p>
         */
        @NameInMap("hotLaunchDuration")
        public Double hotLaunchDuration;

        /**
         * <strong>example:</strong>
         * <p>2023-05-20</p>
         */
        @NameInMap("timePoint")
        public String timePoint;

        public static GetLaunchTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLaunchTrendResponseBodyData self = new GetLaunchTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLaunchTrendResponseBodyData setColdLaunchCount(Long coldLaunchCount) {
            this.coldLaunchCount = coldLaunchCount;
            return this;
        }
        public Long getColdLaunchCount() {
            return this.coldLaunchCount;
        }

        public GetLaunchTrendResponseBodyData setColdLaunchDuration(Double coldLaunchDuration) {
            this.coldLaunchDuration = coldLaunchDuration;
            return this;
        }
        public Double getColdLaunchDuration() {
            return this.coldLaunchDuration;
        }

        public GetLaunchTrendResponseBodyData setFirstLaunchCount(Long firstLaunchCount) {
            this.firstLaunchCount = firstLaunchCount;
            return this;
        }
        public Long getFirstLaunchCount() {
            return this.firstLaunchCount;
        }

        public GetLaunchTrendResponseBodyData setFirstLaunchDuration(Double firstLaunchDuration) {
            this.firstLaunchDuration = firstLaunchDuration;
            return this;
        }
        public Double getFirstLaunchDuration() {
            return this.firstLaunchDuration;
        }

        public GetLaunchTrendResponseBodyData setHotLaunchCount(Long hotLaunchCount) {
            this.hotLaunchCount = hotLaunchCount;
            return this;
        }
        public Long getHotLaunchCount() {
            return this.hotLaunchCount;
        }

        public GetLaunchTrendResponseBodyData setHotLaunchDuration(Double hotLaunchDuration) {
            this.hotLaunchDuration = hotLaunchDuration;
            return this;
        }
        public Double getHotLaunchDuration() {
            return this.hotLaunchDuration;
        }

        public GetLaunchTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
