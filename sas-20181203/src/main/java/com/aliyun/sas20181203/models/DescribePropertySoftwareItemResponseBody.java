// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemResponseBody extends TeaModel {
    /**
     * <p>10</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertySoftwareItemResponseBodyPageInfo pageInfo;

    /**
     * <p>DescribePropertySoftwareItem</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertySoftwareItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The name of the software.</p>
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
         * <p>Queries information about all software assets.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>true</p>
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
        @NameInMap("Count")
        public Integer count;

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
