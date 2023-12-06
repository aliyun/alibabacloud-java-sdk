// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterStrategyCountResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetClusterStrategyCountResponseBodyData> data;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The number of rules.</p>
         */
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
