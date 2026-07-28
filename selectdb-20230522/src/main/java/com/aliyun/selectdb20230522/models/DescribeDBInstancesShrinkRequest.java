// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>New instance test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID. Separate multiple instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>CREATING</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>ACTIVATION</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>RESOURCE_CHANGING</strong>: The instance is being upgraded or downgraded.</p>
     * </li>
     * <li><p><strong>ORDER_PREPARING</strong>: The order is being confirmed.</p>
     * </li>
     * <li><p><strong>READONLY_RESOURCE_CHANGING</strong>: The instance configuration is being changed, and the instance is write-locked.</p>
     * </li>
     * <li><p><strong>DELETING</strong>: The instance is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags of instances.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static DescribeDBInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesShrinkRequest self = new DescribeDBInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstancesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
