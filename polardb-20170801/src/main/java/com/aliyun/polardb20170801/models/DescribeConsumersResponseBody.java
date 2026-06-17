// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeConsumersResponseBody extends TeaModel {
    /**
     * <p>A list of consumers.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeConsumersResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The page size. Valid values: 30, 50, and 100. The default value is 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumersResponseBody self = new DescribeConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumersResponseBody setItems(java.util.List<DescribeConsumersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeConsumersResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeConsumersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeConsumersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeConsumersResponseBodyItems extends TeaModel {
        /**
         * <p>The models that the consumer is allowed to access, specified as a JSON array in string format.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[]&quot;</p>
         */
        @NameInMap("AllowedModels")
        public String allowedModels;

        /**
         * <p>The full API key. This value is returned only by this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-xxxxxx</p>
         */
        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConsumerGroupName")
        public String consumerGroupName;

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-mqveroemc***</p>
         */
        @NameInMap("ConsumerId")
        public String consumerId;

        /**
         * <p>The time when the consumer was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-28T09:56:03+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the consumer was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-04T16:09:29+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The total usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LifetimeCostCount")
        public Long lifetimeCostCount;

        /**
         * <p>The total number of tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LifetimeTokenCount")
        public Long lifetimeTokenCount;

        /**
         * <p>The month-to-date usage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MtdCostCount")
        public Long mtdCostCount;

        /**
         * <p>The number of tokens consumed month-to-date.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MtdTokenCount")
        public Long mtdTokenCount;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The consumer nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>yonghu</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static DescribeConsumersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumersResponseBodyItems self = new DescribeConsumersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeConsumersResponseBodyItems setAllowedModels(String allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public String getAllowedModels() {
            return this.allowedModels;
        }

        public DescribeConsumersResponseBodyItems setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeConsumersResponseBodyItems setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeConsumersResponseBodyItems setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumersResponseBodyItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public DescribeConsumersResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeConsumersResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeConsumersResponseBodyItems setLifetimeCostCount(Long lifetimeCostCount) {
            this.lifetimeCostCount = lifetimeCostCount;
            return this;
        }
        public Long getLifetimeCostCount() {
            return this.lifetimeCostCount;
        }

        public DescribeConsumersResponseBodyItems setLifetimeTokenCount(Long lifetimeTokenCount) {
            this.lifetimeTokenCount = lifetimeTokenCount;
            return this;
        }
        public Long getLifetimeTokenCount() {
            return this.lifetimeTokenCount;
        }

        public DescribeConsumersResponseBodyItems setMtdCostCount(Long mtdCostCount) {
            this.mtdCostCount = mtdCostCount;
            return this;
        }
        public Long getMtdCostCount() {
            return this.mtdCostCount;
        }

        public DescribeConsumersResponseBodyItems setMtdTokenCount(Long mtdTokenCount) {
            this.mtdTokenCount = mtdTokenCount;
            return this;
        }
        public Long getMtdTokenCount() {
            return this.mtdTokenCount;
        }

        public DescribeConsumersResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsumersResponseBodyItems setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

}
