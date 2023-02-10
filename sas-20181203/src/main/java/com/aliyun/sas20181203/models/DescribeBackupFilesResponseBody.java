// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponseBody extends TeaModel {
    @NameInMap("BackupFiles")
    public java.util.List<DescribeBackupFilesResponseBodyBackupFiles> backupFiles;

    @NameInMap("PageInfo")
    public DescribeBackupFilesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupFilesResponseBody self = new DescribeBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupFilesResponseBody setBackupFiles(java.util.List<DescribeBackupFilesResponseBodyBackupFiles> backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }
    public java.util.List<DescribeBackupFilesResponseBodyBackupFiles> getBackupFiles() {
        return this.backupFiles;
    }

    public DescribeBackupFilesResponseBody setPageInfo(DescribeBackupFilesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackupFilesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupFilesResponseBodyBackupFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Subtree")
        public String subtree;

        @NameInMap("Type")
        public String type;

        public static DescribeBackupFilesResponseBodyBackupFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupFilesResponseBodyBackupFiles self = new DescribeBackupFilesResponseBodyBackupFiles();
            return TeaModel.build(map, self);
        }

        public DescribeBackupFilesResponseBodyBackupFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackupFilesResponseBodyBackupFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBackupFilesResponseBodyBackupFiles setSubtree(String subtree) {
            this.subtree = subtree;
            return this;
        }
        public String getSubtree() {
            return this.subtree;
        }

        public DescribeBackupFilesResponseBodyBackupFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBackupFilesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBackupFilesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupFilesResponseBodyPageInfo self = new DescribeBackupFilesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupFilesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBackupFilesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBackupFilesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupFilesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
