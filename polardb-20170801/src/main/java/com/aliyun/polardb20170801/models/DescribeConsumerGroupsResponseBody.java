// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeConsumerGroupsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeConsumerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerGroupsResponseBody self = new DescribeConsumerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerGroupsResponseBody setItems(java.util.List<DescribeConsumerGroupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeConsumerGroupsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeConsumerGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumerGroupsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeConsumerGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConsumerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumerGroupsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeConsumerGroupsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;[]&quot;</p>
         */
        @NameInMap("AllowedModels")
        public String allowedModels;

        /**
         * <strong>example:</strong>
         * <p>cg-xxxxxxxx</p>
         */
        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConsumerGroupName")
        public String consumerGroupName;

        /**
         * <strong>example:</strong>
         * <p>2026-01-28T09:56:03+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2026-01-04T16:09:29+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static DescribeConsumerGroupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerGroupsResponseBodyItems self = new DescribeConsumerGroupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerGroupsResponseBodyItems setAllowedModels(String allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public String getAllowedModels() {
            return this.allowedModels;
        }

        public DescribeConsumerGroupsResponseBodyItems setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeConsumerGroupsResponseBodyItems setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumerGroupsResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeConsumerGroupsResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeConsumerGroupsResponseBodyItems setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeConsumerGroupsResponseBodyItems setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

}
