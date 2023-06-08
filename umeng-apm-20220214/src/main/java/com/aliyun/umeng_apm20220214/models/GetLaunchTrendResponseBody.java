// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetLaunchTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetLaunchTrendResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

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
        @NameInMap("coldLaunchCount")
        public Long coldLaunchCount;

        @NameInMap("coldLaunchDuration")
        public Double coldLaunchDuration;

        @NameInMap("firstLaunchCount")
        public Long firstLaunchCount;

        @NameInMap("firstLaunchDuration")
        public Double firstLaunchDuration;

        @NameInMap("hotLaunchCount")
        public Long hotLaunchCount;

        @NameInMap("hotLaunchDuration")
        public Double hotLaunchDuration;

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
