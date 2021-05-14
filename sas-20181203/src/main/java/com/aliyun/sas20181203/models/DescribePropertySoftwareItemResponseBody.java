// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribePropertySoftwareItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertySoftwareItemResponseBodyPropertyItems> propertyItems;

    public static DescribePropertySoftwareItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareItemResponseBody self = new DescribePropertySoftwareItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribePropertySoftwareItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertySoftwareItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareItemResponseBodyPageInfo self = new DescribePropertySoftwareItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribePropertySoftwareItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribePropertySoftwareItemResponseBodyPropertyItems extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertySoftwareItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareItemResponseBodyPropertyItems self = new DescribePropertySoftwareItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareItemResponseBodyPropertyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertySoftwareItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
