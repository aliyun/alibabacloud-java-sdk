// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertySoftwareItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the software assets returned.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertySoftwareItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertySoftwareItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareItemResponseBody self = new DescribePropertySoftwareItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareItemResponseBody setPageInfo(DescribePropertySoftwareItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertySoftwareItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertySoftwareItemResponseBody setPropertyItems(java.util.List<DescribePropertySoftwareItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertySoftwareItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertySoftwareItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertySoftwareItemResponseBodyPageInfo extends TeaModel {
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

        public static DescribePropertySoftwareItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareItemResponseBodyPageInfo self = new DescribePropertySoftwareItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertySoftwareItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertySoftwareItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertySoftwareItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertySoftwareItemResponseBodyPropertyItems extends TeaModel {
        /**
         * <p>The number of servers on which the software is installed.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the software.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePropertySoftwareItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareItemResponseBodyPropertyItems self = new DescribePropertySoftwareItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertySoftwareItemResponseBodyPropertyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
