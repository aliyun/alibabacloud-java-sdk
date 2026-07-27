// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBatchConsumerResponseBody extends TeaModel {
    /**
     * <p>The list of consumer objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<CreateBatchConsumerResponseBodyItems> items;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of records per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static CreateBatchConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchConsumerResponseBody self = new CreateBatchConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchConsumerResponseBody setItems(java.util.List<CreateBatchConsumerResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreateBatchConsumerResponseBodyItems> getItems() {
        return this.items;
    }

    public CreateBatchConsumerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateBatchConsumerResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public CreateBatchConsumerResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateBatchConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchConsumerResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public CreateBatchConsumerResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class CreateBatchConsumerResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the key is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The full API key. Returned only in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The MD5 hash of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>0769a11c2d474f96fbb527f8e273d3de</p>
         */
        @NameInMap("ApiKeyMd5")
        public String apiKeyMd5;

        /**
         * <p>The status of the API key. Default value: Active.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ApiKeyStatus")
        public String apiKeyStatus;

        /**
         * <p>The API key status. Default value: Active.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ApiStatus")
        public String apiStatus;

        /**
         * <p>The budget limit, which equals the number of credits per package.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("BudgetLimit")
        public Long budgetLimit;

        /**
         * <p>The budget policy ID. Each key has an independent budget policy.</p>
         * 
         * <strong>example:</strong>
         * <p>023aacc1effc4b56bb154bfbec6ba9**</p>
         */
        @NameInMap("BudgetPolicyId")
        public String budgetPolicyId;

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BudgetUsed")
        public Long budgetUsed;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-xxxxxx</p>
         */
        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-mqveroemc***</p>
         */
        @NameInMap("ConsumerId")
        public String consumerId;

        /**
         * <p>The consumer tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConsumerTag")
        public String consumerTag;

        /**
         * <p>The application description or remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-25T09:37:10Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the key is expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-04T16:09:29+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The consumer status. Default value: Enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateBatchConsumerResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchConsumerResponseBodyItems self = new CreateBatchConsumerResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CreateBatchConsumerResponseBodyItems setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateBatchConsumerResponseBodyItems setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateBatchConsumerResponseBodyItems setApiKeyMd5(String apiKeyMd5) {
            this.apiKeyMd5 = apiKeyMd5;
            return this;
        }
        public String getApiKeyMd5() {
            return this.apiKeyMd5;
        }

        public CreateBatchConsumerResponseBodyItems setApiKeyStatus(String apiKeyStatus) {
            this.apiKeyStatus = apiKeyStatus;
            return this;
        }
        public String getApiKeyStatus() {
            return this.apiKeyStatus;
        }

        public CreateBatchConsumerResponseBodyItems setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public CreateBatchConsumerResponseBodyItems setBudgetLimit(Long budgetLimit) {
            this.budgetLimit = budgetLimit;
            return this;
        }
        public Long getBudgetLimit() {
            return this.budgetLimit;
        }

        public CreateBatchConsumerResponseBodyItems setBudgetPolicyId(String budgetPolicyId) {
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }
        public String getBudgetPolicyId() {
            return this.budgetPolicyId;
        }

        public CreateBatchConsumerResponseBodyItems setBudgetUsed(Long budgetUsed) {
            this.budgetUsed = budgetUsed;
            return this;
        }
        public Long getBudgetUsed() {
            return this.budgetUsed;
        }

        public CreateBatchConsumerResponseBodyItems setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public CreateBatchConsumerResponseBodyItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public CreateBatchConsumerResponseBodyItems setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public CreateBatchConsumerResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBatchConsumerResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateBatchConsumerResponseBodyItems setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public CreateBatchConsumerResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public CreateBatchConsumerResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateBatchConsumerResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public CreateBatchConsumerResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBatchConsumerResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
