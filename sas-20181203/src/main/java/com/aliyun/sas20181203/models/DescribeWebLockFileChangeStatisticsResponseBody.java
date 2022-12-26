// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileChangeStatisticsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeWebLockFileChangeStatisticsResponseBodyList> list;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

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
