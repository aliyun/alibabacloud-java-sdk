// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkMinuteTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetNetworkMinuteTrendResponseBodyData> data;

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

    public static GetNetworkMinuteTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkMinuteTrendResponseBody self = new GetNetworkMinuteTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkMinuteTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetNetworkMinuteTrendResponseBody setData(java.util.List<GetNetworkMinuteTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNetworkMinuteTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetNetworkMinuteTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetNetworkMinuteTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNetworkMinuteTrendResponseBodyData extends TeaModel {
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
        @NameInMap("requestCount")
        public Long requestCount;

        /**
         * <strong>example:</strong>
         * <p>2023-05-20 09:08</p>
         */
        @NameInMap("timePoint")
        public String timePoint;

        public static GetNetworkMinuteTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkMinuteTrendResponseBodyData self = new GetNetworkMinuteTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNetworkMinuteTrendResponseBodyData setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetNetworkMinuteTrendResponseBodyData setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public GetNetworkMinuteTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

}
