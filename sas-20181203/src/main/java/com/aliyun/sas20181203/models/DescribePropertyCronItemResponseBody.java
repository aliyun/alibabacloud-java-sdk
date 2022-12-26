// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyCronItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyCronItemResponseBodyPropertyItems> propertyItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyCronItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronItemResponseBody self = new DescribePropertyCronItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronItemResponseBody setPageInfo(DescribePropertyCronItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyCronItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyCronItemResponseBody setPropertyItems(java.util.List<DescribePropertyCronItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertyCronItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertyCronItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyCronItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyCronItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyCronItemResponseBodyPageInfo self = new DescribePropertyCronItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyCronItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyCronItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyCronItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyCronItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyCronItemResponseBodyPropertyItems extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Source")
        public String source;

        public static DescribePropertyCronItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyCronItemResponseBodyPropertyItems self = new DescribePropertyCronItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyCronItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyCronItemResponseBodyPropertyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
