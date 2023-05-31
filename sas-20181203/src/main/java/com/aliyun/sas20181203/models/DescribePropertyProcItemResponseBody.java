// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyProcItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the processes returned.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyProcItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyProcItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcItemResponseBody self = new DescribePropertyProcItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcItemResponseBody setPageInfo(DescribePropertyProcItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyProcItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyProcItemResponseBody setPropertyItems(java.util.List<DescribePropertyProcItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertyProcItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertyProcItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyProcItemResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyProcItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcItemResponseBodyPageInfo self = new DescribePropertyProcItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyProcItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyProcItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyProcItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyProcItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyProcItemResponseBodyPropertyItems extends TeaModel {
        /**
         * <p>The number of servers on which the process runs.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the process.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePropertyProcItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcItemResponseBodyPropertyItems self = new DescribePropertyProcItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyProcItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyProcItemResponseBodyPropertyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
