// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The path to the backup file.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The hash value of the backup file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The UUID of the server to which an anti-ransomware policy is applied.</p>
     * <br>
     * <p>This parameter is required.</p>
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
