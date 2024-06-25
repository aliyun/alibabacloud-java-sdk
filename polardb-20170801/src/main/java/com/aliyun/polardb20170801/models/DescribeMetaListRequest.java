// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the data backup file.</p>
     * <blockquote>
     * <ul>
     * <li>When you run a query, you must specify the <code>BackId</code> or <code>RestoreTime</code> parameter.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the ID of the backup set.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specify the specific database name (such as <code>test_db</code>) to query the names of all data tables that can be restored in the desired database.</p>
     * <blockquote>
     * <ul>
     * <li>You can specify only one database name each time.</li>
     * <li>If you do not specify this parameter, you can query the names of all databases that can be restored in the current backup set. However, you cannot query the names of data tables in each database.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * <p>Default value: <strong>30</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/2319132.html">DescribeDBClusterAttribute</a> operation to query the region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time for the restoration. Specify the time in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> When you run a query, you must specify the <code>BackId</code> or <code>RestoreTime</code> parameter. You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the point in time for the restoration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-10-04T01:40:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListRequest self = new DescribeMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeMetaListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMetaListRequest setGetDbName(String getDbName) {
        this.getDbName = getDbName;
        return this;
    }
    public String getGetDbName() {
        return this.getDbName;
    }

    public DescribeMetaListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeMetaListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMetaListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaListRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeMetaListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMetaListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMetaListRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public DescribeMetaListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
