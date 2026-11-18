// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogDownloadLinksRequest extends TeaModel {
    /**
     * <p>The redo log backup IDs.</p>
     * <blockquote>
     * <p>First, invoke DescribeBackupLogs to obtain valid IDs. This parameter is required when you invoke the operation. If omitted, an InvalidArchiveLogIds.Malformed error (HTTP 400) is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>78167430</p>
     */
    @NameInMap("BackupLogIds")
    public String backupLogIds;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>This parameter is required for the call. If omitted, an InvalidDBClusterId.Malformed error (HTTP 400) is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The validity period of the download links, in hours. Valid values: 1 to 596523.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExpireHours")
    public Integer expireHours;

    public static DescribeBackupLogDownloadLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogDownloadLinksRequest self = new DescribeBackupLogDownloadLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogDownloadLinksRequest setBackupLogIds(String backupLogIds) {
        this.backupLogIds = backupLogIds;
        return this;
    }
    public String getBackupLogIds() {
        return this.backupLogIds;
    }

    public DescribeBackupLogDownloadLinksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeBackupLogDownloadLinksRequest setExpireHours(Integer expireHours) {
        this.expireHours = expireHours;
        return this;
    }
    public Integer getExpireHours() {
        return this.expireHours;
    }

}
