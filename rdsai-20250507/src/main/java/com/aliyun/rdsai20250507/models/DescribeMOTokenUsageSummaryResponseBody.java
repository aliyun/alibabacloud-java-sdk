// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Records")
    public java.util.List<DescribeMOTokenUsageSummaryResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Summary")
    public DescribeMOTokenUsageSummaryResponseBodySummary summary;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    public static DescribeMOTokenUsageSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageSummaryResponseBody self = new DescribeMOTokenUsageSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMOTokenUsageSummaryResponseBody setRecords(java.util.List<DescribeMOTokenUsageSummaryResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeMOTokenUsageSummaryResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeMOTokenUsageSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMOTokenUsageSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMOTokenUsageSummaryResponseBody setSummary(DescribeMOTokenUsageSummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public DescribeMOTokenUsageSummaryResponseBodySummary getSummary() {
        return this.summary;
    }

    public DescribeMOTokenUsageSummaryResponseBody setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public static class DescribeMOTokenUsageSummaryResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-rds-ds5jjo08hyz1g9orhs3y56l5cy3l3shm</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("CacheTokens")
        public Double cacheTokens;

        /**
         * <strong>example:</strong>
         * <p>2026-04-21</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("InputTokens")
        public Double inputTokens;

        /**
         * <strong>example:</strong>
         * <p>qcy-apikey</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("OutputTokens")
        public Double outputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalTokens")
        public Double totalTokens;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        public static DescribeMOTokenUsageSummaryResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeMOTokenUsageSummaryResponseBodyRecords self = new DescribeMOTokenUsageSummaryResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setCacheTokens(Double cacheTokens) {
            this.cacheTokens = cacheTokens;
            return this;
        }
        public Double getCacheTokens() {
            return this.cacheTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setInputTokens(Double inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Double getInputTokens() {
            return this.inputTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setOutputTokens(Double outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Double getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setTotalTokens(Double totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Double getTotalTokens() {
            return this.totalTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodyRecords setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

    }

    public static class DescribeMOTokenUsageSummaryResponseBodySummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("CacheTokens")
        public Double cacheTokens;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("InputTokens")
        public Double inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OutputTokens")
        public Double outputTokens;

        /**
         * <strong>example:</strong>
         * <p>11000</p>
         */
        @NameInMap("TotalTokens")
        public Double totalTokens;

        public static DescribeMOTokenUsageSummaryResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeMOTokenUsageSummaryResponseBodySummary self = new DescribeMOTokenUsageSummaryResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public DescribeMOTokenUsageSummaryResponseBodySummary setCacheTokens(Double cacheTokens) {
            this.cacheTokens = cacheTokens;
            return this;
        }
        public Double getCacheTokens() {
            return this.cacheTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodySummary setInputTokens(Double inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Double getInputTokens() {
            return this.inputTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodySummary setOutputTokens(Double outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Double getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeMOTokenUsageSummaryResponseBodySummary setTotalTokens(Double totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Double getTotalTokens() {
            return this.totalTokens;
        }

    }

}
