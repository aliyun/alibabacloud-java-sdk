// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of application information.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetChangeOrderMetricResponseBodyData> data;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B763F98-0BA2-5C23-B6B8-558568D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the service list was retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The service list was retrieved.</li>
     * <li><strong>false</strong>: The retrieval failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetChangeOrderMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricResponseBody self = new GetChangeOrderMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChangeOrderMetricResponseBody setData(java.util.List<GetChangeOrderMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChangeOrderMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetChangeOrderMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChangeOrderMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeOrderMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChangeOrderMetricResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The average time consumed, in milliseconds.</p>
         */
        @NameInMap("AvgTimeCostMs")
        public Float avgTimeCostMs;

        /**
         * <p>The number of abnormal change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Error")
        public Long error;

        /**
         * <p>The percentage of failed change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("ErrorPercent")
        public Float errorPercent;

        /**
         * <p>The maximum time consumed, in milliseconds.</p>
         */
        @NameInMap("MaxTimeCostMs")
        public Float maxTimeCostMs;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The optimization suggestions.</p>
         */
        @NameInMap("OptimizeSuggestions")
        public String optimizeSuggestions;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The average time consumed by the task, in milliseconds.</p>
         */
        @NameInMap("TaskTimeCostMsAvg")
        public String taskTimeCostMsAvg;

        /**
         * <p>The total number of change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetChangeOrderMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderMetricResponseBodyData self = new GetChangeOrderMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetChangeOrderMetricResponseBodyData setAvgTimeCostMs(Float avgTimeCostMs) {
            this.avgTimeCostMs = avgTimeCostMs;
            return this;
        }
        public Float getAvgTimeCostMs() {
            return this.avgTimeCostMs;
        }

        public GetChangeOrderMetricResponseBodyData setError(Long error) {
            this.error = error;
            return this;
        }
        public Long getError() {
            return this.error;
        }

        public GetChangeOrderMetricResponseBodyData setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        public GetChangeOrderMetricResponseBodyData setMaxTimeCostMs(Float maxTimeCostMs) {
            this.maxTimeCostMs = maxTimeCostMs;
            return this;
        }
        public Float getMaxTimeCostMs() {
            return this.maxTimeCostMs;
        }

        public GetChangeOrderMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChangeOrderMetricResponseBodyData setOptimizeSuggestions(String optimizeSuggestions) {
            this.optimizeSuggestions = optimizeSuggestions;
            return this;
        }
        public String getOptimizeSuggestions() {
            return this.optimizeSuggestions;
        }

        public GetChangeOrderMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetChangeOrderMetricResponseBodyData setTaskTimeCostMsAvg(String taskTimeCostMsAvg) {
            this.taskTimeCostMsAvg = taskTimeCostMsAvg;
            return this;
        }
        public String getTaskTimeCostMsAvg() {
            return this.taskTimeCostMsAvg;
        }

        public GetChangeOrderMetricResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
