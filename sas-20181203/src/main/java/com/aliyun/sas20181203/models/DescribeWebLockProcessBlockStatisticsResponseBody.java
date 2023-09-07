// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockProcessBlockStatisticsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array consisting of the statistics on processes.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeWebLockProcessBlockStatisticsResponseBodyList> list;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of processes.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockProcessBlockStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockProcessBlockStatisticsResponseBody self = new DescribeWebLockProcessBlockStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockProcessBlockStatisticsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockProcessBlockStatisticsResponseBody setList(java.util.List<DescribeWebLockProcessBlockStatisticsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockProcessBlockStatisticsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockProcessBlockStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockProcessBlockStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockProcessBlockStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockProcessBlockStatisticsResponseBodyList extends TeaModel {
        /**
         * <p>The number of processes that are returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The process.</p>
         */
        @NameInMap("Process")
        public String process;

        public static DescribeWebLockProcessBlockStatisticsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockProcessBlockStatisticsResponseBodyList self = new DescribeWebLockProcessBlockStatisticsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockProcessBlockStatisticsResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebLockProcessBlockStatisticsResponseBodyList setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

}
