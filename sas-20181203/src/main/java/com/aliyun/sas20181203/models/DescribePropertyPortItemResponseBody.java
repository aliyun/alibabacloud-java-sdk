// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyPortItemResponseBodyPageInfo pageInfo;

    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyPortItemResponseBodyPropertyItems> propertyItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyPortItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortItemResponseBody self = new DescribePropertyPortItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortItemResponseBody setPageInfo(DescribePropertyPortItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyPortItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyPortItemResponseBody setPropertyItems(java.util.List<DescribePropertyPortItemResponseBodyPropertyItems> propertyItems) {
        this.propertyItems = propertyItems;
        return this;
    }
    public java.util.List<DescribePropertyPortItemResponseBodyPropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    public DescribePropertyPortItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyPortItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyPortItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortItemResponseBodyPageInfo self = new DescribePropertyPortItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyPortItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyPortItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyPortItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyPortItemResponseBodyPropertyItems extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Port")
        public String port;

        @NameInMap("Proto")
        public String proto;

        public static DescribePropertyPortItemResponseBodyPropertyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortItemResponseBodyPropertyItems self = new DescribePropertyPortItemResponseBodyPropertyItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortItemResponseBodyPropertyItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyPortItemResponseBodyPropertyItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePropertyPortItemResponseBodyPropertyItems setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

    }

}
