// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupDirsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeBackupDirsResponseBodyPageInfo pageInfo;

    @NameInMap("BackupDirs")
    public java.util.List<DescribeBackupDirsResponseBodyBackupDirs> backupDirs;

    public static DescribeBackupDirsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDirsResponseBody self = new DescribeBackupDirsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDirsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDirsResponseBody setPageInfo(DescribeBackupDirsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackupDirsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackupDirsResponseBody setBackupDirs(java.util.List<DescribeBackupDirsResponseBodyBackupDirs> backupDirs) {
        this.backupDirs = backupDirs;
        return this;
    }
    public java.util.List<DescribeBackupDirsResponseBodyBackupDirs> getBackupDirs() {
        return this.backupDirs;
    }

    public static class DescribeBackupDirsResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeBackupDirsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDirsResponseBodyPageInfo self = new DescribeBackupDirsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDirsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBackupDirsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupDirsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeBackupDirsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeBackupDirsResponseBodyBackupDirs extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("BackupJobId")
        public Long backupJobId;

        public static DescribeBackupDirsResponseBodyBackupDirs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDirsResponseBodyBackupDirs self = new DescribeBackupDirsResponseBodyBackupDirs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDirsResponseBodyBackupDirs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeBackupDirsResponseBodyBackupDirs setBackupJobId(Long backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public Long getBackupJobId() {
            return this.backupJobId;
        }

    }

}
