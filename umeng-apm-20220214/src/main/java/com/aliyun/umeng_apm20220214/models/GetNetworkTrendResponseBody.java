// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetNetworkTrendResponseBodyData> data;

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
        /**
         * <strong>example:</strong>
         * <p>4402.8</p>
         */
        @NameInMap("avgCost")
        public Double avgCost;

        /**
         * <strong>example:</strong>
         * <p>1654.51</p>
         */
        @NameInMap("avgResponseTime")
        public Double avgResponseTime;

        /**
         * <strong>example:</strong>
         * <p>3299.43</p>
         */
        @NameInMap("avgTransformBytes")
        public Double avgTransformBytes;

        /**
         * <strong>example:</strong>
         * <p>1.61</p>
         */
        @NameInMap("requestPerMinute")
        public Double requestPerMinute;

        /**
         * <strong>example:</strong>
         * <p>2023-05-20</p>
         */
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
