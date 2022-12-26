// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyTypeScaItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyTypeScaItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyTypeItems")
    public java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> propertyTypeItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyTypeScaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyTypeScaItemResponseBody self = new DescribePropertyTypeScaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyTypeScaItemResponseBody setPageInfo(DescribePropertyTypeScaItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyTypeScaItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyTypeScaItemResponseBody setPropertyTypeItems(java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> propertyTypeItems) {
        this.propertyTypeItems = propertyTypeItems;
        return this;
    }
    public java.util.List<DescribePropertyTypeScaItemResponseBodyPropertyTypeItems> getPropertyTypeItems() {
        return this.propertyTypeItems;
    }

    public DescribePropertyTypeScaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyTypeScaItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyTypeScaItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyTypeScaItemResponseBodyPageInfo self = new DescribePropertyTypeScaItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyTypeScaItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyTypeScaItemResponseBodyPropertyTypeItems extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribePropertyTypeScaItemResponseBodyPropertyTypeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyTypeScaItemResponseBodyPropertyTypeItems self = new DescribePropertyTypeScaItemResponseBodyPropertyTypeItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyTypeScaItemResponseBodyPropertyTypeItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyTypeScaItemResponseBodyPropertyTypeItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
