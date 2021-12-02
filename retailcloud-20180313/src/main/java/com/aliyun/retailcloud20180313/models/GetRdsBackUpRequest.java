// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetRdsBackUpRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetRdsBackUpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRdsBackUpRequest self = new GetRdsBackUpRequest();
        return TeaModel.build(map, self);
    }

    public GetRdsBackUpRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public GetRdsBackUpRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public GetRdsBackUpRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public GetRdsBackUpRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetRdsBackUpRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
