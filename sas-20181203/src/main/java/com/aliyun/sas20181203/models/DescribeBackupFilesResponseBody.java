// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the backup files returned.</p>
     */
    @NameInMap("BackupFiles")
    public java.util.List<DescribeBackupFilesResponseBodyBackupFiles> backupFiles;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeBackupFilesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00A60A6D-33E0-5D5A-9B7C-E5D4DCA88148</p>
     */
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
        /**
         * <p>The name of the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Group 1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The path to the subdirectory of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>Python27\</p>
         */
        @NameInMap("Subtree")
        public String subtree;

        /**
         * <p>The type of the protected file. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: files</li>
         * <li><strong>dir</strong>: folders</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dir</p>
         */
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
        /**
         * <p>The number of backup files returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of backup files returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
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
