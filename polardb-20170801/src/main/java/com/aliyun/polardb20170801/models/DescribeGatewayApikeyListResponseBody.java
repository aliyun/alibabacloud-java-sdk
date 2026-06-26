// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayApikeyListResponseBody extends TeaModel {
    /**
     * <p>The list of consumer objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeGatewayApikeyListResponseBodyItems> items;

    /**
     * <p>The page number.</p>
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
     * <p>The number of entries per page. Valid values:</p>
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
     * <p>A0450B18-BBD4-5DF9-8E71-610F1A921CDE</p>
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
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeGatewayApikeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayApikeyListResponseBody self = new DescribeGatewayApikeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayApikeyListResponseBody setItems(java.util.List<DescribeGatewayApikeyListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeGatewayApikeyListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeGatewayApikeyListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewayApikeyListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGatewayApikeyListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewayApikeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayApikeyListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGatewayApikeyListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGatewayApikeyListResponseBodyItems extends TeaModel {
        /**
         * <p>The API key in use.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29T09:31:37Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeGatewayApikeyListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayApikeyListResponseBodyItems self = new DescribeGatewayApikeyListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayApikeyListResponseBodyItems setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeGatewayApikeyListResponseBodyItems setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeGatewayApikeyListResponseBodyItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public DescribeGatewayApikeyListResponseBodyItems setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public DescribeGatewayApikeyListResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGatewayApikeyListResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeGatewayApikeyListResponseBodyItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeGatewayApikeyListResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
