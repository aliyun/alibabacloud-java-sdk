// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckItemResultResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageContentResource")
    public DescribeRiskCheckItemResultResponseBodyPageContentResource pageContentResource;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskCheckItemResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckItemResultResponseBody self = new DescribeRiskCheckItemResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckItemResultResponseBody setPageContentResource(DescribeRiskCheckItemResultResponseBodyPageContentResource pageContentResource) {
        this.pageContentResource = pageContentResource;
        return this;
    }
    public DescribeRiskCheckItemResultResponseBodyPageContentResource getPageContentResource() {
        return this.pageContentResource;
    }

    public DescribeRiskCheckItemResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskCheckItemResultResponseBodyPageContentResource extends TeaModel {
        /**
         * <p>The data of the affected assets on each page in a dynamic table.</p>
         */
        @NameInMap("ContentResource")
        public java.util.Map<String, ?> contentResource;

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
         * <p>The total number of pages returned.</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

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

        public static DescribeRiskCheckItemResultResponseBodyPageContentResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckItemResultResponseBodyPageContentResource self = new DescribeRiskCheckItemResultResponseBodyPageContentResource();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setContentResource(java.util.Map<String, ?> contentResource) {
            this.contentResource = contentResource;
            return this;
        }
        public java.util.Map<String, ?> getContentResource() {
            return this.contentResource;
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRiskCheckItemResultResponseBodyPageContentResource setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
