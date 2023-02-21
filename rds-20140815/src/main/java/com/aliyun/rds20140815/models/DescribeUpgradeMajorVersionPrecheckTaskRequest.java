// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionPrecheckTaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return in the upgrade check report.</p>
     * <br>
     * <p>Valid values: any non-zero positive integer. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page of the upgrade check report.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   30 (This is the default value.)</p>
     * <p>*   50</p>
     * <p>*   100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new major engine version of the instance. The new major engine version must be later than the original major engine version.</p>
     * <br>
     * <p>For example, if the original major engine version is PostgreSQL 9.4, the new major engine version can be PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, or PostgreSQL 13.</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The ID of the upgrade check task. You can obtain the ID of the upgrade check task from the **TaskId** parameter that is returned from the call of the [UpgradeDBInstanceMajorVersionPrecheck](~~330050~~) operation.</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static DescribeUpgradeMajorVersionPrecheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionPrecheckTaskRequest self = new DescribeUpgradeMajorVersionPrecheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
