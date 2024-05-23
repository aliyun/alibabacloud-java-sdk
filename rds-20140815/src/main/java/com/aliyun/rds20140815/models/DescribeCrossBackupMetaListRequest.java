// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the cross-region backup file that you want to use. You can call the [DescribeCrossRegionBackups](https://help.aliyun.com/document_detail/121733.html) operation to query the ID of the cross-region backup file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The name of the database that you want to query. The system implements exact match based on the value of this parameter and returns the name of the matched database and the names of the tables in the matched database.</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: any non-zero positive integer.</p>
     * <br>
     * <p>> This parameter only takes effect when you specify the **PageSize** parameter.</p>
     */
    @NameInMap("PageIndex")
    public String pageIndex;

    /**
     * <p>The number of entries to return per page. Default value: **1**.</p>
     * <br>
     * <p>> This parameter only takes effect when you specify the **PageIndex** parameter.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the database that you want to query. The system implements fuzzy match based on the value of this parameter and returns only the name of the matched database.</p>
     * <br>
     * <p>> You can implement fuzzy match and then exact match. For example, you can set the Pattern parameter to test to query the testdb1 and testdb2 databases. Then, you can specify the **GetDbName** parameter to query only the matched database and the tables in the matched database.</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    public DescribeCrossBackupMetaListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCrossBackupMetaListRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public DescribeCrossBackupMetaListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossBackupMetaListRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public DescribeCrossBackupMetaListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeCrossBackupMetaListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCrossBackupMetaListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCrossBackupMetaListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
