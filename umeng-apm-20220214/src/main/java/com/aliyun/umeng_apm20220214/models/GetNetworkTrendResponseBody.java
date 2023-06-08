// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetNetworkTrendResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    public static GetNetworkTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkTrendResponseBody self = new GetNetworkTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetNetworkTrendResponseBody setData(java.util.List<GetNetworkTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNetworkTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetNetworkTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetNetworkTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNetworkTrendResponseBodyData extends TeaModel {
        @NameInMap("avgCost")
        public Double avgCost;

        @NameInMap("avgResponseTime")
        public Double avgResponseTime;

        @NameInMap("avgTransformBytes")
        public Double avgTransformBytes;

        @NameInMap("requestPerMinute")
        public Double requestPerMinute;

        @NameInMap("timePoint")
        public String timePoint;

        public static GetNetworkTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkTrendResponseBodyData self = new GetNetworkTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNetworkTrendResponseBodyData setAvgCost(Double avgCost) {
            this.avgCost = avgCost;
            return this;
        }
        public Double getAvgCost() {
            return this.avgCost;
        }

        public GetNetworkTrendResponseBodyData setAvgResponseTime(Double avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public Double getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public GetNetworkTrendResponseBodyData setAvgTransformBytes(Double avgTransformBytes) {
            this.avgTransformBytes = avgTransformBytes;
            return this;
        }
        public Double getAvgTransformBytes() {
            return this.avgTransformBytes;
        }

        public GetNetworkTrendResponseBodyData setRequestPerMinute(Double requestPerMinute) {
            this.requestPerMinute = requestPerMinute;
            return this;
        }
        public Double getRequestPerMinute() {
            return this.requestPerMinute;
        }

        public GetNetworkTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
