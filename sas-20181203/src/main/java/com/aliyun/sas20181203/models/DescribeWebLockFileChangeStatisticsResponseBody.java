// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileChangeStatisticsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array consisting of the files that are changed.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeWebLockFileChangeStatisticsResponseBodyList> list;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of files that are attempted to change.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockFileChangeStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileChangeStatisticsResponseBody self = new DescribeWebLockFileChangeStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileChangeStatisticsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockFileChangeStatisticsResponseBody setList(java.util.List<DescribeWebLockFileChangeStatisticsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockFileChangeStatisticsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockFileChangeStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockFileChangeStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockFileChangeStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockFileChangeStatisticsResponseBodyList extends TeaModel {
        /**
         * <p>The number of attempts.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The file path.</p>
         */
        @NameInMap("File")
        public String file;

        public static DescribeWebLockFileChangeStatisticsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockFileChangeStatisticsResponseBodyList self = new DescribeWebLockFileChangeStatisticsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockFileChangeStatisticsResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebLockFileChangeStatisticsResponseBodyList setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

    }

}
