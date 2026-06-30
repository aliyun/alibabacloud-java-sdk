// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageDetailResponseBody extends TeaModel {
    /**
     * <p>The cursor for the next page. An empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzNDUsInRzIjoiMjAyNi0wNC0wOFQwMDowMDowMFoifQ==</p>
     */
    @NameInMap("NextCursor")
    public String nextCursor;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of records returned.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeMOTokenUsageDetailResponseBodyRecords> records;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The usage type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    public static DescribeMOTokenUsageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageDetailResponseBody self = new DescribeMOTokenUsageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageDetailResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public DescribeMOTokenUsageDetailResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeMOTokenUsageDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMOTokenUsageDetailResponseBody setRecords(java.util.List<DescribeMOTokenUsageDetailResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeMOTokenUsageDetailResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeMOTokenUsageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMOTokenUsageDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMOTokenUsageDetailResponseBody setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public static class DescribeMOTokenUsageDetailResponseBodyRecords extends TeaModel {
        /**
         * <p>The consumer associated with the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
         */
        @NameInMap("ConsumerName")
        public String consumerName;

        /**
         * <p>The additional information passed by the user in the extra_info field during the request. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;label&quot;: &quot;test&quot;}</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The number of input tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("InputTokens")
        public Double inputTokens;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The model that was called.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of output tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("OutputTokens")
        public Double outputTokens;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The request time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01T01:00:00Z</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalTokens")
        public Double totalTokens;

        public static DescribeMOTokenUsageDetailResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeMOTokenUsageDetailResponseBodyRecords self = new DescribeMOTokenUsageDetailResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setInputTokens(Double inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Double getInputTokens() {
            return this.inputTokens;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setOutputTokens(Double outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Double getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public DescribeMOTokenUsageDetailResponseBodyRecords setTotalTokens(Double totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Double getTotalTokens() {
            return this.totalTokens;
        }

    }

}
