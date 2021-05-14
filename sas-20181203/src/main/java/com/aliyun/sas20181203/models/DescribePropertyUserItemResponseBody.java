// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribePropertyUserItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyUserItemResponseBodyPropertyItems> propertyItems;

    public static DescribePropertyUserItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserItemResponseBody self = new DescribePropertyUserItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribePropertyUserItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertyUserItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserItemResponseBodyPageInfo self = new DescribePropertyUserItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribePropertyUserItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribePropertyUserItemResponseBodyPropertyItems extends TeaModel {
        @NameInMap("User")
        public String user;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertyUserItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUserItemResponseBodyPropertyItems self = new DescribePropertyUserItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUserItemResponseBodyPropertyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribePropertyUserItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
