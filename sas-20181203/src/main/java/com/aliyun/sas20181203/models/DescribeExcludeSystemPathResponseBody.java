// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExcludeSystemPathResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the directories that are excluded.</p>
     */
    @NameInMap("ExcludePaths")
    public java.util.List<DescribeExcludeSystemPathResponseBodyExcludePaths> excludePaths;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeExcludeSystemPathResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExcludeSystemPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcludeSystemPathResponseBody self = new DescribeExcludeSystemPathResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcludeSystemPathResponseBody setExcludePaths(java.util.List<DescribeExcludeSystemPathResponseBodyExcludePaths> excludePaths) {
        this.excludePaths = excludePaths;
        return this;
    }
    public java.util.List<DescribeExcludeSystemPathResponseBodyExcludePaths> getExcludePaths() {
        return this.excludePaths;
    }

    public DescribeExcludeSystemPathResponseBody setPageInfo(DescribeExcludeSystemPathResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeExcludeSystemPathResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeExcludeSystemPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExcludeSystemPathResponseBodyExcludePaths extends TeaModel {
        /**
         * <p>The operating system of the server. Valid values:</p>
         * <br>
         * <p>*   **linux**: Linux</p>
         * <p>*   **windows**: Windows</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The absolute path to the directory.</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeExcludeSystemPathResponseBodyExcludePaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeExcludeSystemPathResponseBodyExcludePaths self = new DescribeExcludeSystemPathResponseBodyExcludePaths();
            return TeaModel.build(map, self);
        }

        public DescribeExcludeSystemPathResponseBodyExcludePaths setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeExcludeSystemPathResponseBodyExcludePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeExcludeSystemPathResponseBodyPageInfo extends TeaModel {
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

        public static DescribeExcludeSystemPathResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExcludeSystemPathResponseBodyPageInfo self = new DescribeExcludeSystemPathResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExcludeSystemPathResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeExcludeSystemPathResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeExcludeSystemPathResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeExcludeSystemPathResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
