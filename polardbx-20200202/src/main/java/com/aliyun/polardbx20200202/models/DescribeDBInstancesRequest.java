// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    @NameInMap("DbVersion")
    public String dbVersion;

    /**
     * <p>The description or remarks of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>app-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dinga93c84f4d***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the instance must have a log engine.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MustHasCdc")
    public Boolean mustHasCdc;

    /**
     * <p>The page number. Starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li><ol start="100">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyst47******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>enterprise</strong>: Enterprise Edition.</li>
     * <li><strong>standard</strong>: Standard Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;TagKey\&quot;:\&quot;test\&quot;,\&quot;TagValue\&quot;:\&quot;test-value\&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public String getDbVersion() {
        return this.dbVersion;
    }

    public DescribeDBInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBInstancesRequest setMustHasCdc(Boolean mustHasCdc) {
        this.mustHasCdc = mustHasCdc;
        return this;
    }
    public Boolean getMustHasCdc() {
        return this.mustHasCdc;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public DescribeDBInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
