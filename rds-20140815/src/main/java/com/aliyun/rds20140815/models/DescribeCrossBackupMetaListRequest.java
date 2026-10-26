// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the cross-region backup set. You can call the DescribeCrossRegionBackups operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The name of the database to query. Exact match is used. The specific database name and the names of tables in the database are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb1</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: any integer greater than 0 and less than or equal to the maximum value of the Integer type.</p>
     * <blockquote>
     * <p>This parameter must be used together with <strong>PageSize</strong> to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public String pageIndex;

    /**
     * <p>The number of entries per page. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter must be used together with <strong>PageIndex</strong> to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the database to query. Fuzzy match is used. Only the matched database names are returned, and table names are not returned.</p>
     * <blockquote>
     * <p>You can use fuzzy match first. For example, enter test to match testdb1 and testdb2. After you determine the target database name, use exact match by specifying <strong>GetDbName</strong> to view the specific database name and table names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The region where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
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
