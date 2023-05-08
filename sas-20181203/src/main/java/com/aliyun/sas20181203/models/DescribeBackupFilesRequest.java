// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesRequest extends TeaModel {
    /**
     * <p>The UUID of the server to which an anti-ransomware policy is applied.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>An array that consists of the backup files returned.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The size of the backup file. Unit: bytes.</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeBackupFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupFilesRequest self = new DescribeBackupFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupFilesRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBackupFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupFilesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeBackupFilesRequest setSnapshotHash(String snapshotHash) {
        this.snapshotHash = snapshotHash;
        return this;
    }
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    public DescribeBackupFilesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
