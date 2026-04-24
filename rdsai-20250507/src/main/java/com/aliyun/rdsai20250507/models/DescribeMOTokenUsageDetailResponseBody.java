// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMOTokenUsageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageDetailResponseBody self = new DescribeMOTokenUsageDetailResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeMOTokenUsageDetailResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
         */
        @NameInMap("ConsumerName")
        public String consumerName;

        /**
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>2026-04-01T01:00:00Z</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
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
