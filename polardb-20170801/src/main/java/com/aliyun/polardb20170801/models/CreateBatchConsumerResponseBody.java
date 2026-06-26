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
         * <p>The complete API key. This value is returned only in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The API key status. Default value: Active.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ApiStatus")
        public String apiStatus;

        /**
         * <p>The ID of the user group.</p>
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

        public CreateBatchConsumerResponseBodyItems setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateBatchConsumerResponseBodyItems setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
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
