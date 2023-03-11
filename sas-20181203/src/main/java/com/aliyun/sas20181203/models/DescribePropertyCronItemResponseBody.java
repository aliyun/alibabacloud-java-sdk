// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronItemResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyCronItemResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of scheduled tasks.</p>
     */
    @NameInMap("PropertyItems")
    public java.util.List<DescribePropertyCronItemResponseBodyPropertyItems> propertyItems;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The number of servers on which the scheduled task is run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The path to the scheduled task.</p>
         */
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
