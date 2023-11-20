// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterStrategyCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetClusterStrategyCountResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetClusterStrategyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterStrategyCountResponseBody self = new GetClusterStrategyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterStrategyCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterStrategyCountResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetClusterStrategyCountResponseBody setData(java.util.List<GetClusterStrategyCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetClusterStrategyCountResponseBodyData> getData() {
        return this.data;
    }

    public GetClusterStrategyCountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetClusterStrategyCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterStrategyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterStrategyCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetClusterStrategyCountResponseBodyData extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("StrategyCount")
        public Integer strategyCount;

        public static GetClusterStrategyCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterStrategyCountResponseBodyData self = new GetClusterStrategyCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterStrategyCountResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterStrategyCountResponseBodyData setStrategyCount(Integer strategyCount) {
            this.strategyCount = strategyCount;
            return this;
        }
        public Integer getStrategyCount() {
            return this.strategyCount;
        }

    }

}
