// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListRequest extends TeaModel {
    @NameInMap("BackupSetId")
    @Validation(required = true)
    public String backupSetId;

    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("Pattern")
    public String pattern;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("Region")
    public String region;

    public static DescribeCrossBackupMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListRequest self = new DescribeCrossBackupMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossBackupMetaListRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeCrossBackupMetaListRequest setGetDbName(String getDbName) {
        this.getDbName = getDbName;
        return this;
    }
    public String getGetDbName() {
        return this.getDbName;
    }

    public DescribeCrossBackupMetaListRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public DescribeCrossBackupMetaListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossBackupMetaListRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public DescribeCrossBackupMetaListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
