// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupDirsResponseBody extends TeaModel {
    @NameInMap("BackupDirs")
    public java.util.List<DescribeBackupDirsResponseBodyBackupDirs> backupDirs;

    @NameInMap("PageInfo")
    public DescribeBackupDirsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupDirsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDirsResponseBody self = new DescribeBackupDirsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDirsResponseBody setBackupDirs(java.util.List<DescribeBackupDirsResponseBodyBackupDirs> backupDirs) {
        this.backupDirs = backupDirs;
        return this;
    }
    public java.util.List<DescribeBackupDirsResponseBodyBackupDirs> getBackupDirs() {
        return this.backupDirs;
    }

    public DescribeBackupDirsResponseBody setPageInfo(DescribeBackupDirsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackupDirsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackupDirsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupDirsResponseBodyBackupDirs extends TeaModel {
        @NameInMap("BackupJobId")
        public Long backupJobId;

        @NameInMap("Source")
        public String source;

        public static DescribeBackupDirsResponseBodyBackupDirs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDirsResponseBodyBackupDirs self = new DescribeBackupDirsResponseBodyBackupDirs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDirsResponseBodyBackupDirs setBackupJobId(Long backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public Long getBackupJobId() {
            return this.backupJobId;
        }

        public DescribeBackupDirsResponseBodyBackupDirs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class DescribeBackupDirsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBackupDirsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDirsResponseBodyPageInfo self = new DescribeBackupDirsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDirsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
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

    }

}
