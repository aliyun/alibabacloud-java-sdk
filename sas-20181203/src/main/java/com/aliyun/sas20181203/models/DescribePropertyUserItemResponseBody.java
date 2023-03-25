// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyUserItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the account information returned.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyUserItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyUserItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserItemResponseBody self = new DescribePropertyUserItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserItemResponseBody setPageInfo(DescribePropertyUserItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyUserItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyUserItemResponseBody setPropertyItems(java.util.List<DescribePropertyUserItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertyUserItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertyUserItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyUserItemResponseBodyPageInfo extends TeaModel {
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

        public static DescribePropertyUserItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserItemResponseBodyPageInfo self = new DescribePropertyUserItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUserItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyUserItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyUserItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyUserItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyUserItemResponseBodyPropertyItems extends TeaModel {
        /**
         * <p>The number of servers that belong to the account.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribePropertyUserItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserItemResponseBodyPropertyItems self = new DescribePropertyUserItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUserItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyUserItemResponseBodyPropertyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
