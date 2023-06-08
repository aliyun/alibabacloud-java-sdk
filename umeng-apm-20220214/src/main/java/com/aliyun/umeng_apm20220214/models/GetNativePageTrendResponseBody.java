// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNativePageTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetNativePageTrendResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    public static GetNativePageTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNativePageTrendResponseBody self = new GetNativePageTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNativePageTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetNativePageTrendResponseBody setData(java.util.List<GetNativePageTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNativePageTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetNativePageTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetNativePageTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNativePageTrendResponseBodyData extends TeaModel {
        @NameInMap("avgLoadDuration")
        public Double avgLoadDuration;

        @NameInMap("crashRate")
        public Double crashRate;

        @NameInMap("loadCnt")
        public Long loadCnt;

        @NameInMap("slowLoadRate")
        public Double slowLoadRate;

        @NameInMap("timePoint")
        public String timePoint;

        public static GetNativePageTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNativePageTrendResponseBodyData self = new GetNativePageTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNativePageTrendResponseBodyData setAvgLoadDuration(Double avgLoadDuration) {
            this.avgLoadDuration = avgLoadDuration;
            return this;
        }
        public Double getAvgLoadDuration() {
            return this.avgLoadDuration;
        }

        public GetNativePageTrendResponseBodyData setCrashRate(Double crashRate) {
            this.crashRate = crashRate;
            return this;
        }
        public Double getCrashRate() {
            return this.crashRate;
        }

        public GetNativePageTrendResponseBodyData setLoadCnt(Long loadCnt) {
            this.loadCnt = loadCnt;
            return this;
        }
        public Long getLoadCnt() {
            return this.loadCnt;
        }

        public GetNativePageTrendResponseBodyData setSlowLoadRate(Double slowLoadRate) {
            this.slowLoadRate = slowLoadRate;
            return this;
        }
        public Double getSlowLoadRate() {
            return this.slowLoadRate;
        }

        public GetNativePageTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
